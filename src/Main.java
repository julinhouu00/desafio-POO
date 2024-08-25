import com.julio.dominio.*;

import java.time.LocalDate;

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

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Mentoria curso java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();

        mentoria2.setTitulo("Mentoria js");
        mentoria2.setDescricao("Mentoria curso js");
        mentoria2.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devJulio = new Dev();
        devJulio.setNome("Julio");
        devJulio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julio"+ devJulio.getConteudosInscritos());

        devJulio.progradir();
        devJulio.progradir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Julio"+ devJulio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Julio"+ devJulio.getConteuddosConcluidos());
        System.out.println("Xp: " + devJulio.calcularTotalXp());


        System.out.println("-----------");

        Dev devCesar = new Dev();
        devCesar.setNome("Cesar");
        devCesar.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cesar"+ devCesar.getConteudosInscritos());
        devCesar.progradir();
        devCesar.progradir();
        devCesar.progradir();
        devCesar.progradir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cesar"+ devCesar.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Cesar"+ devCesar.getConteuddosConcluidos());
        System.out.println("Xp: " + devCesar.calcularTotalXp());
    }
}
