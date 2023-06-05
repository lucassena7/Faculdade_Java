public class Morango extends Produto {
    private static final double PRECO = 3.0;

    public Morango(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
