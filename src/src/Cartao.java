public class Cartao {
    private int id;
    private String numcartao;
    private String titular;
    private int cvv;
    private String datav;

    public Cartao(int id, String numcartao, String titular, int cvv, String datav) {
        this.id = id;
        this.numcartao = numcartao;
        this.titular = titular;
        this.cvv = cvv;
        this.datav = datav;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumcartao() {
        return numcartao;
    }

    public void setNumcartao(String numcartao) {
        this.numcartao = numcartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getDatav() {
        return datav;
    }

    public void setDatav(String datav) {
        this.datav = datav;
    }
    @Override
    public String toString(){
        return "\nID: " +id+
                "\nNúmero: " +numcartao+
                "\nTitular: " +titular+
                "\nCVV: " +cvv+
                "\nValido até: " +datav;
    }

}
