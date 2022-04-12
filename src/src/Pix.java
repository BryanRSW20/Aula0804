public class Pix {
    private int id;
    private String chave;

    public Pix(int id, String chave) {
        this.id = id;
        this.chave = chave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
    @Override
    public String toString(){
        return "\nID: " +id+
                "\nChave: " +chave;
    }
}
