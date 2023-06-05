public class Pera extends Produto {
    private static final double PRECO = 2.0;

    public Pera(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
