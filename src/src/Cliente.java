import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private Cartao cartao;
    private Pix pix;
    private int id;
    private ArrayList<Aula> aulasCurso;

    public Cliente( int id, String nome, int idade, String telefone, String cpf, Endereco endereco, Cartao cartao, Pix pix) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cartao = cartao;
        this.pix = pix;
        this.id = id;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }

    public ArrayList<Aula> getAulasCurso() {
        return aulasCurso;
    }

    public void setAulasCurso(ArrayList<Aula> aulasCurso) {
        this.aulasCurso = aulasCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Nome: " +nome+
                "\nIdade: " +idade+
                "\nCPF: " +cpf+
                "\nID: " +id+
                "\nTelefone: " +telefone+
                "\nEndereço: " +endereco+
                "\nMétodos de Pagamento salvos: " +
                "\nCartão: " +cartao+
                "\nPix: " +pix+
                "\nAulas acessíveis: " +aulasCurso;

    }
}