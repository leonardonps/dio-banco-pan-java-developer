package list.exerciciospropostos.ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int QTD_MESES = 6;
    public static void main(String[] args) {

        /*
        Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
        Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
        e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
        */

        Scanner s = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = new ArrayList<>(){{
           add("Janeiro");
           add("Fevereiro");
           add("Março");
           add("Abril");
           add("Maio");
           add("Junho");
           add("Julho");
           add("Agosto");
           add("Setembro");
           add("Outubro");
           add("Novembro");
           add("Dezembro");
        }};
        Double soma = 0d, media;

        for(int i = 0; i < QTD_MESES; i++){
            System.out.println("Digite a temperatura mensal: ");
            temperaturas.add(s.nextDouble());
        }

        Iterator<Double> iterator = temperaturas.iterator();

        while(iterator.hasNext()){
            Double temperatura = iterator.next();
            soma += temperatura;
        }

        media = (soma/temperaturas.size());

        System.out.println(String.format("A média semestral deu: %.2f", media));

        System.out.println("Meses com temperaturas acima da média: ");
        for(int i = 0; i < QTD_MESES; i++){
            if(temperaturas.get(i) > media){
                System.out.println(String.format("%d - %s - %.2fºC", (i+1), meses.get(i), temperaturas.get(i)));
            }
        }
    }
}
