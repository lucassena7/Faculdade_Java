public class Banana extends Produto {
    private static final double PRECO = 1.5;

    public Banana(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
