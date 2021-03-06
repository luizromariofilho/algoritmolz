package algoritmo.lz.demo.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Compressor {

    private String texto;
    private final Map<String, Integer> dicionario;

    public Compressor(String textoOriginal) {
        this.texto = textoOriginal;
        dicionario = new HashMap<>();
    }

    public Map<String, Integer> getDicionario() {
        return dicionario;
    }

    public String comprimir() {
//        texto = texto.toUpperCase(); //transforma em maisculo para diminuir a quantidade de palavras no dicionario
        texto = texto.replaceAll("\\p{Digit}", ""); // remove todos os dígitos para evitar erro
        texto = texto.replaceAll("\\p{Punct}", ""); // remove todos os pontos para diminuir a quantidade de palavras no dicionario
        Set<String> words = new LinkedHashSet<>(Arrays.asList(texto.split("\\s+"))); // quebra por palavras e adiciona num conjunto
        // cria o dicionario atraves do conjuntos de palavras
        Integer cont = 0;
        for (String w : words) {
            dicionario.put(w, cont);
            cont++;
        }
        //substitui no texto as palavras pelo indice do dicionario
        for (String string : words) {
            texto = texto.replaceAll("\\b" + string + "\\b", String.valueOf(dicionario.get(string)));
        }
        return texto;
    }
}
