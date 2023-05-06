public class Veiculo {
        private int numAssentos;
        private int numAssentosDisponiveis;
        private String origem;
        private String destino;
    
        public Veiculo(int numAssentos, int numAssentosDisponiveis, String origem, String destino) {
            this.numAssentos = numAssentos;
            this.numAssentosDisponiveis = numAssentosDisponiveis;
            this.origem = origem;
            this.destino = destino;
        }
    
        public boolean comprar() {
            if (numAssentosDisponiveis > 0) {
                numAssentosDisponiveis--;
                return true;
            } else {
                return false;
            }
        }
    
        public int getNumAssentosDisponiveis() {
            return numAssentosDisponiveis;
        }
    
        public int getNumAssentos() {
            return numAssentos;
        }
    
        public String getOrigem() {
            return origem;
        }
    
        public String getDestino() {
            return destino;
        }
        public String toString() {
            return origem + "-" + destino + " (" + numAssentosDisponiveis + " assentos disponíveis de " + numAssentos + ")";
        }
}
