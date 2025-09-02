import java.util.ArrayList;

public class Heroi extends Pessoa {

    private boolean identidadeSecreta;
    private String comidaFavorita;
    private Arma arma;
    private ArrayList<Habilidade> habilidades = new ArrayList<>();

    public Heroi(String nome, String genero, double altura, boolean identidadeSecreta, String comidaFavorita, Arma arma){
        super(nome,genero,altura);
        this.identidadeSecreta = identidadeSecreta;
        this.comidaFavorita = comidaFavorita;
        this.arma = arma;

    }

    public boolean isIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public void setIdentidadeSecreta(boolean identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }
    public ArrayList<Habilidade> getHabilidades(){
        return this.habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setHabilidades(ArrayList<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public String mostrarListaDeHabilidades() {
        String resultado = "";
        for (Habilidade h : habilidades) {
            resultado += "* " + h.getNome() + "\n";
        }
        return resultado;
    }


    public void apresentar(){
        System.out.println(
                "Eu sou " + super.getNome() +
                        ", sou do gênero " + super.getSexo() +
                        ", minha altura é: " + super.getAltura() +
                        ", minhas super habilidades são:\n" + mostrarListaDeHabilidades() +
                        "E minha arma especial é: " + this.arma.getNome()
        );
    }
}
