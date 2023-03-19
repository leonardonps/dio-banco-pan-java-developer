package list.aula;

import list.aula.ComparatorCor;
import list.aula.ComparatorIdade;
import list.aula.ComparatorNomeCorIdade;
import list.aula.Gato;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Comandos básicos da collection List
//
//        System.out.println("Crie uma lista e adicione as sete notas: ");
//
//        List<Double> notas = new ArrayList<Double>();
//
//        notas.add(7.0);
//        notas.add(8.5);
//        notas.add(9.3);
//        notas.add(5.0);
//        notas.add(7.0);
//        notas.add(8.0);
//        notas.add(3.6);
//
//        System.out.println(notas.toString());
//
//        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
//
//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//        notas.add(4, 8d);
//        System.out.println(notas);
//
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        notas.set(notas.indexOf(5d), 6.0);
//        System.out.println(notas);
//
//        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
//
//        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
//        System.out.println(notas.toString());
//
//        System.out.println("Exiba a menor nota: " + Collections.min(notas));
//
//        System.out.println("Exiba a maior nota: " + Collections.max(notas));
//
//        System.out.println("Exiba a soma dos valores: ");
//        Iterator<Double> iterator = notas.iterator();
//        Double soma = 0d;
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
//        System.out.println("Remova a nota da posição 0: ");
//        notas.remove(0);
//        System.out.println(notas);
//
//        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
//        Iterator<Double> iterator1 = notas.iterator();
//        while(iterator1.hasNext()){
//            Double next = iterator1.next();
//            if(next<7) iterator1.remove();
//        }
//        System.out.println(notas);
//
//        System.out.println("Apague toda a lista: ");
//        notas.clear();
//        System.out.println(notas);
//
//        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
//
//        LinkedList<Double> notas2 = new LinkedList<>();
//
//        notas2.add(5.7);
//        notas2.add(6.5);
//        notas2.add(7.7);
//        notas2.add(9.0);
//        notas2.add(7.0);
//        notas2.add(8.5);
//        notas2.add(5.0);
//
//
//        EXERCÍCIOS PROPOSTO EM AULA - LISTA UTILIZANDO LINKEDLIST
//
//        System.out.println("Lista feita usando LinkedList: ");
//        System.out.println(notas2);
//
//        System.out.println("Primeiro elemnto da lista é: " + notas2.get(0));
//
//        System.out.println("Mostrando o primeiro elemento: " + notas2.get(0) + " e removendo-o...");
//        notas2.remove(0);
//
//        System.out.println("Lista LinkedList atualizada: ");
//        System.out.println(notas2);
//
//        FIM DO EXERCÍCIO PROPOSTO

        // Ordenação de elementos na coleção List

        List <Gato> meusGatos = new ArrayList<>(){{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\t Ordem de inserção \t--");
        System.out.println(meusGatos);

        System.out.println("--\t Ordem aleatório \t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Natural (nome) \t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Idade \t--");
        // Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\t Ordem cor \t--");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Nome/Cor/Idade \t--");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}

