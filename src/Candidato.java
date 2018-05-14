public class Candidato {

    private int numero;

    private String nome;

    private Cargo cargo;

    private String partido;

    public Candidato(int numero, String nome, Cargo cargo, String partido) throws ErroNoCandidatoException {
        this.numero = numero;
        this.nome = nome;
        this.cargo = cargo;
        this.partido = partido;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getPartido() {
        return partido;
    }
}
