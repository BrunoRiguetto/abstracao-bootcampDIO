package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bottcamp Java Developer");
		bootcamp.setDescricao("Descriçao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devBruno = new Dev();
		devBruno.setNome("Bruno");
		devBruno.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Bruno" + devBruno.getConteudosInstritos());
		devBruno.progredir();
		devBruno.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos Bruno" + devBruno.getConteudosInstritos());
		System.out.println("Conteudos Concluidos Bruno" + devBruno.getConteudosConcluidos());
		System.out.println("XP: " + devBruno.calcularTotalXp());
		
		
		System.out.println("--------------------------------------------------------------------");
		
		Dev devYasmin = new Dev();
		devYasmin.setNome("Yasmin");
		devYasmin.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Yasmin" + devYasmin.getConteudosInstritos());
		devYasmin.progredir();
		devYasmin.progredir();
		devYasmin.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos Yasmin" + devYasmin.getConteudosInstritos());
		System.out.println("Conteudos Concluidos Yasmin" + devYasmin.getConteudosConcluidos());
		System.out.println("XP: " + devYasmin.calcularTotalXp());
		
	}

}
