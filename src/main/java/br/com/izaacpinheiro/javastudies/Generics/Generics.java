package br.com.izaacpinheiro.javastudies.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // recurso que permite criar classes, métodos e interfaces que operam com tipos parametrizados
        // type erasure
        // validação em tempo de compilação
        List<String> lista = new ArrayList<>();
        lista.add("Izaac");
        lista.add("Júlia");

        Caixa<String> stringBox = new Caixa<>();
        stringBox.setConteudo("estou estudando java");
        String cont = stringBox.getConteudo();
        System.out.println(cont);
    }

    static class Caixa<T>{ // "T" é o parâmetro de tipo (pode ser qualquer letra)
        private T conteudo;

        public void setConteudo(T conteudo){
            this.conteudo = conteudo;
        }

        public T getConteudo(){
            return conteudo;
        }
    }
}
