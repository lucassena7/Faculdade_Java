public class Uva extends Produto {
    private static final double PRECO = 1.0;

    public Uva(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
