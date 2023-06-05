public class Mamao extends Produto {
    private static final double PRECO = 2.3;

    public Mamao(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
