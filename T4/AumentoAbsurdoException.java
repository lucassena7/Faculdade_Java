public class AumentoAbsurdoException extends RuntimeException {
    private final String artigo;

    public AumentoAbsurdoException(String mensagem, String artigo) {
        super(mensagem);
        this.artigo = artigo;
    }

    public String getArtigo() {
        return artigo;
    }
}
