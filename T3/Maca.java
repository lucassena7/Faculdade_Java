public class Maca extends Produto {
    private static final double PRECO = 2.0;
    
    public Maca(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
