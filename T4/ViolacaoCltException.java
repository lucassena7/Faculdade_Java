public class ViolacaoCltException extends IllegalArgumentException {
    private final String artigo;

    public ViolacaoCltException(String mensagem, String artigo) {
        super(mensagem);
        this.artigo = artigo;
    }

    public String getArtigo() {
        return artigo;
    }
}
