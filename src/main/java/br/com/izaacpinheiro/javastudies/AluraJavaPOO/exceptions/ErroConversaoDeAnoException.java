package br.com.izaacpinheiro.javastudies.AluraJavaPOO.exceptions;

// criando nossa própria excessão
public class ErroConversaoDeAnoException extends RuntimeException {

    private String mensagem;

    public ErroConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
