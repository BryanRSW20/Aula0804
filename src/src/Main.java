import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Aula aula = new Aula("Introdução ao Curso", "Aula HTML5", 1);
        Aula aula1 = new Aula("Conhecendo o CSS3", "CSS3", 2);
        Aula aula2 = new Aula("Conhecendo o JavaScript", "JavaScript", 3);
        ArrayList <Aula> list = new ArrayList<>();
        list.add(aula);
        list.add(aula1);
        list.add(aula2);
        Pix pix = new Pix(1, "012.345.678-90");
        Cartao cartao = new Cartao(1, "1234 5678 9012 3456", "FULANO", 182, "01/29");
        Endereco endereco = new Endereco(1 , "Fulanópolis","Bairro do Limoeiro", "Rua do Curso", 991);
        Cliente cliente = new Cliente(1,"Fulano", 27, "(11) 22334-5566", "012.345.678-90", endereco, cartao, pix);
        cliente.setAulasCurso(list);
        System.out.println(cliente);

    }
}
