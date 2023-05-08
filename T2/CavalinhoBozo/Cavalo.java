public class Cavalo {
    private String nome;
    private String avatar;
    private double distancia;

    public Cavalo(String nome) {
        if (nome.equals("pretinho") || nome.equals("branquinho") || nome.equals("malhadinho")) {
            this.nome = nome;
            this.avatar = nome.substring(0, 1).toUpperCase() + ">";
            this.distancia = 0.0;
        } else {
            throw new IllegalArgumentException("Nome de cavalo inválido!");
        }
    }

    public double correr() {
        double distanciaPercorrida = Math.random();
        this.distancia += distanciaPercorrida;
        mostrar();
        return this.distancia;
    }

    private void mostrar() {
        int distanciaInteira = (int) this.distancia;
        String linha = this.nome.toUpperCase() + ": " + this.avatar;
        for (int i = 0; i < distanciaInteira; i++) {
            linha += " ";
        }
        System.out.println(linha);
    }

    public double getDistancia() {
        return distancia;
    }
}
