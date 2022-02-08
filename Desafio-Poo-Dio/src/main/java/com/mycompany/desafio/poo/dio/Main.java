package com.mycompany.desafio.poo.dio;

//@author Camila da Costa

import com.mycompany.desafio.poo.dio.dominio.Bootcamp;
import com.mycompany.desafio.poo.dio.dominio.Curso;
import com.mycompany.desafio.poo.dio.dominio.Dev;
import com.mycompany.desafio.poo.dio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descricao Curso Java");
        cursoJava.setCargaHoraria(12);
        
        Curso cursoPhp = new Curso();
        cursoPhp.setTitulo("Curso PHP");
        cursoPhp.setDescricao("Descricao Curso PHP");
        cursoPhp.setCargaHoraria(8);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Start Java #1");
        bootcamp.setDescricao("Descrição Bootcamp Start Java #1");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPhp);
        bootcamp.getConteudos().add(mentoria);
        
        Dev inscrito1 = new Dev();
        inscrito1.setNome("Camila da Costa");
        inscrito1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de "+inscrito1.getNome()+inscrito1.getConteudosInscritos());
        inscrito1.progredir();
        inscrito1.progredir();
        System.out.println("\nConteudos Concluídos de "+inscrito1.getNome()+inscrito1.getConteudosConcluidos());
        System.out.println("\nXP = "+inscrito1.calcularTotalXp());
        
        Dev inscrito2 = new Dev();
        inscrito2.setNome("Professora DIO");
        inscrito2.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos de "+inscrito2.getNome()+inscrito2.getConteudosInscritos());
        inscrito2.progredir();
        System.out.println("\nConteudos Concluídos de "+inscrito2.getNome()+inscrito2.getConteudosConcluidos());
        System.out.println("\nXP = "+inscrito2.calcularTotalXp());
    }   
}
