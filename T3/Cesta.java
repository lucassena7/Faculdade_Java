import java.util.ArrayList;
import java.util.List;

public class Cesta {
    private static final int MAX_PRODUTOS = 12;
    private List<Produto> produtos;
    private int quantidadeProdutos;

    public Cesta() {
        produtos = new ArrayList<>();
        quantidadeProdutos = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (quantidadeProdutos < MAX_PRODUTOS) {
            produtos.add(produto);
            quantidadeProdutos++;
            System.out.println("Produto adicionado à cesta.");
        } else {
            System.out.println("A cesta está cheia. Não é possível adicionar mais produtos.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void listarCesta() {
        for (Produto produto : produtos) {
            System.out.println("Tipo: " + produto.getClass().getSimpleName());
            System.out.println("Preço unitário: R$" + produto.getPreco());
            System.out.println("Quantidade: " + produto.quantidade);
            System.out.println("-------------------------");
        }
        System.out.println("Valor total da cesta: R$" + calcularTotal());
    }

    public void limparCesta() {
        produtos.clear();
        quantidadeProdutos = 0;
        System.out.println("A cesta foi limpa.");
    }
}
