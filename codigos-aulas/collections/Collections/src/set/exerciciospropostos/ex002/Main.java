package set.exerciciospropostos.ex002;

import set.aula.Serie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    /*
        Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
        Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        a) Ordem de inserção;
        b) Ordem natural(nome);
        c) IDE;
        d) Ano de criação e nome;
        e) Nome, ano de criação e IDE;
        Ao final, exiba as linguagens no console, um abaixo da outra.
    */
        System.out.println("Criando um conjunto com 3 linguagens:");
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>(){{
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
            add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
        }};

        for(LinguagemFavorita linguagem : minhasLinguagensFavoritas){
            System.out.println(String.format("Linguagem: %s | Ano de criação: %d | IDE: %s",
                    linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIDE()));
        }

        //a) Ordem de inserção;
        System.out.println("");
        System.out.println("--\tOrdem de inserção\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritasInsercao = new LinkedHashSet<>(minhasLinguagensFavoritas);
        for(LinguagemFavorita linguagem : minhasLinguagensFavoritasInsercao){
            System.out.println(String.format("Linguagem: %s | Ano de criação: %d | IDE: %s",
                    linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIDE()));
        }

        //b) Ordem natural(nome);
        System.out.println("");
        System.out.println("--\tOrdem por Nome\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritasNome = new TreeSet<>(minhasLinguagensFavoritas);

        for(LinguagemFavorita linguagem : minhasLinguagensFavoritasNome){
            System.out.println(String.format("Linguagem: %s | Ano de criação: %d | IDE: %s",
                    linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIDE()));
        }

        //c) Ordem da IDE;
        System.out.println("");
        System.out.println("--\tOrdem por IDE\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritasIDE = new TreeSet<>(new ComparatorIDE());

        minhasLinguagensFavoritasIDE.addAll(minhasLinguagensFavoritas);

        for(LinguagemFavorita linguagem : minhasLinguagensFavoritasIDE){
            System.out.println(String.format("Linguagem: %s | Ano de criação: %d | IDE: %s",
                    linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIDE()));
        }

        //d) Ordem por Nome e Ano de criação;
        System.out.println("");
        System.out.println("--\tOrdem por Nome e Ano de criação\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritasNomeAnoDeCriacao = new TreeSet<>(new ComparatorNomeAnoDeCriacao());

        minhasLinguagensFavoritasNomeAnoDeCriacao.addAll(minhasLinguagensFavoritas);

        for(LinguagemFavorita linguagem : minhasLinguagensFavoritasNomeAnoDeCriacao){
            System.out.println(String.format("Linguagem: %s | Ano de criação: %d | IDE: %s",
                    linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIDE()));
        }

        //e) Nome, ano de criação e IDE;
        System.out.println("");
        System.out.println("--\tOrdem por Nome, Ano de criação e IDE\t--");
        Set<LinguagemFavorita> minhasLinguagensFavoritasNomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoIDE());

        minhasLinguagensFavoritasNomeAnoIDE.addAll(minhasLinguagensFavoritas);

        for(LinguagemFavorita linguagem : minhasLinguagensFavoritasNomeAnoIDE){
            System.out.println(String.format("Linguagem: %s | Ano de criação: %d | IDE: %s",
                    linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIDE()));
        }

    }
}
