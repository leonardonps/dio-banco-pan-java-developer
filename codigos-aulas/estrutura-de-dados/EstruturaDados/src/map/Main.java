package map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3A");

        System.out.println(aluno);

        List<Map<String, String>> listaAlunos = new ArrayList();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "178");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3B");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

    }
}
