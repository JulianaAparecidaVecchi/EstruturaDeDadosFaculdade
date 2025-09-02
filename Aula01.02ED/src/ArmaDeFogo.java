public class ArmaDeFogo extends Arma{

    public ArmaDeFogo(String nome, double dano) {
        super(nome, dano);
    }


    @Override
    public void atirar() {
        System.out.println("Atirando munições de fogo. Dano causado = " + getDano());
    }
}
