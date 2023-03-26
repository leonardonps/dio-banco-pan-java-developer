import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição Curso de Java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição Curso de Javascript");
        curso2.setCargaHoraria(2);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Python");
        curso3.setDescricao("Descrição Curso de Python");
        curso3.setCargaHoraria(3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Padrões de Projeto");
        mentoria1.setDescricao("Descrição de Padrões de Projeto");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camila");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        devCamilla.progredir();
        devCamilla.progredir();
        System.out.println('-');
        System.out.println("Conteúdos Inscritos Camila: " + devCamilla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila: " + devCamilla.getConteudosConcluidos());
        System.out.println("XP: " + devCamilla.calcularTotalXp());


        System.out.println("---------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println('-');
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
