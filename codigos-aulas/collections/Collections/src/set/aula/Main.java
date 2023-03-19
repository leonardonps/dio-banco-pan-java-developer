package set.aula;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Crie um conjunto e adicione as notas: ");
//        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//        System.out.println(notas.toString());
//
//        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
//
//        System.out.println("Exiba a menor nota: " + Collections.min(notas));
//
//        System.out.println("Exiba a maior nota: " + Collections.max(notas));
//        Iterator<Double> iterator = notas.iterator();
//        Double soma = 0.0;
//        while(iterator.hasNext()){
//            Double next = iterator.next();
//            soma += next;
//        }
//        System.out.println("Exiba a soma dos valores: " + soma);
//
//        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
//
//        System.out.println("Remova a nota 0: ");
//        notas.remove(0d);
//        System.out.println(notas);
//
//        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
//        Iterator<Double> iterator1 = notas.iterator();
//        while(iterator1.hasNext()){
//            Double next = iterator1.next();
//            if(next < 7) iterator1.remove();
//        }
//        System.out.println(notas);
//
//        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
//        Set<Double> notas2 = new LinkedHashSet<>();
//        notas2.add(7d);
//        notas2.add(8.5);
//        notas2.add(9.3);
//        notas2.add(5d);
//        notas2.add(7d);
//        notas2.add(0d);
//        notas2.add(3.6);
//        System.out.println(notas2);
//
//        System.out.println("Exiba todas as notas na ordem crescente: ");
//        Set<Double> notas3 = new TreeSet<>(notas2);
//        // Só consegue usar notas2 nesse caso, porque o tipo de elemento dele, Double, tem Comparable
//        System.out.println(notas3);
//
//        System.out.println("Apague todo o conjunto: ");
//        notas.clear();
//
//        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
//        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
//        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

        System.out.println("--\t Ordem inserção \t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for(Serie serie: minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie: minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries1);
        for(Serie serie: minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


    }
}
