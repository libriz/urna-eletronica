
public class Candidato {
    private int id;
    private String nome;
    private String cargo;
    private String partido;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public String getPartido() {
        return partido;
    }
}
