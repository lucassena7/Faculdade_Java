public class Limao extends Produto {
    private static final double PRECO = 1.5;

    public Limao(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
