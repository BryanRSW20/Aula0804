import java.util.ArrayList;

public class Aula {
    private String titulo;
    private String conteudo;
    private int id;

    public Aula(String titulo, String conteudo, int id) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.id = id;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nTítulo: " +titulo+
                "\nConteúdo: " +conteudo+
                "\nID: " +id;
    }
}
