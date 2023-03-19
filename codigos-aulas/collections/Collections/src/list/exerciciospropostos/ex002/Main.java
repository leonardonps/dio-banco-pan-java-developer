package list.exerciciospropostos.ex002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vítima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
        "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
        */

        Scanner s = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>(){{
           add("Telefonou para a vítima?");
           add("Esteve no local do crime?");
           add("Mora perto da vítima?");
           add("Devia para a vítima?");
           add("Já trabalhou com a vítima?");
        }};

        List<String> respostas = new ArrayList<>();

        for(String pergunta : perguntas){
            System.out.println(pergunta);
            respostas.add(s.next().toLowerCase());
        }

        int contadorSim = 0;
        for(String resposta : respostas){



            if(resposta.equals("sim") || resposta.charAt(0) == 's'){
                contadorSim++;
            }
        }

        System.out.println(contadorSim);
        if(contadorSim < 2){
            System.out.println("Inocente");
        } else if(contadorSim == 2){
            System.out.println("Suspeita");
        } else if(contadorSim > 2 && contadorSim < 5){
            System.out.println("Cúmplice");
        } else{
            System.out.println("Assassina");
        }

    }
}
