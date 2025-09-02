public class ArmaDeGelo extends Arma{
    public ArmaDeGelo(String nome, double dano) {
        super(nome, dano);
    }


    @Override
    public void atirar() {
        System.out.println("Atirando munições congelantes. Dano causado = " + getDano());
    }
}
