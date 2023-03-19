package set.exerciciospropostos.ex001;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Crie uma conjunto contendo as cores do arco-íris e:
        a) Exiba todas as cores o arco-íris uma abaixo da outra;
        b) A quantidade de cores que o arco-íris tem;
        c) Exiba as cores em ordem alfabética;
        d) Exiba as cores na ordem inversa da que foi informada;
        e) Exiba todas as cores que começam com a letra ”v”;
        f) Remova todas as cores que não começam com a letra “v”;
        g) Limpe o conjunto;
        h) Confira se o conjunto está vazio;
        */

        // a) Exiba todas as cores do arco-íris uma abaixo da outra
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Violeta");
        arcoIris.add("Anil");
        arcoIris.add("Azul");
        arcoIris.add("Verde");
        arcoIris.add("Amarelo");
        arcoIris.add("Laranja");
        arcoIris.add("Vermelho");

        for(String cor : arcoIris){
            System.out.println(cor);
        }

        //b) A quantidade de cores que o arco-íris tem;

        System.out.println("A quantidade de cores que o arco-íris tem é: " + arcoIris.size());

        //c) Exiba as cores em ordem alfabética;
        Set<String> arcoIrisOrdemAlfabetica = new TreeSet<>(arcoIris);
        System.out.println("A ordem alfabética é: ");
        for(String cor : arcoIrisOrdemAlfabetica){
            System.out.println(cor);
        }

        //d) Exiba as cores na ordem inversa da que foi informada;
        Set<String> arcoIrisOrdemInversa = new LinkedHashSet<>(){{
            add("Violeta");
            add("Anil");
            add("Azul");
            add("Verde");
            add("Amarelo");
            add("Laranja");
            add("Vermelho");
        }};

        ArrayList<String> listaArcoIrisOrdemInversa = new ArrayList<>(arcoIrisOrdemInversa);

        Collections.reverse(listaArcoIrisOrdemInversa);

        System.out.println("A ordem inversa é: ");
        for(String cor : listaArcoIrisOrdemInversa){
            System.out.println(cor);
        }

        //e) Exiba todas as cores que começam com a letra ”v”;
        System.out.println("Arco íris só com as cores que começam com V:");
        for(String cor : arcoIris) {
            if (cor.charAt(0) == 'V') {
                System.out.println(cor);
            }
        }

        //f) Remova todas as cores que não começam com a letra “v”;
        System.out.println("Removendo cores que não começam com \"v\"...");
        Iterator<String> iterator = arcoIris.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.charAt(0) != 'V') iterator.remove();
        }

        System.out.println("Arco íris só com as cores que começam com V: " + arcoIris);
        //g) Limpe o conjunto;
        arcoIris.clear();
        //h) Confira se o conjunto está vazio;
        System.out.println("Conjunto arcoIris está vazio: " + arcoIris.isEmpty());
    }
}
