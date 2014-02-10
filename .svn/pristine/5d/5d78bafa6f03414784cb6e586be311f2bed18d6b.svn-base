package algoritmo.lz.demo.src;

import java.util.HashMap;
import java.util.Map;

public class Descompressor {

    private String texto;
    private final Map<String, Integer> dicionario;
    private final Map<Integer, String> inverseDicionario = new HashMap<>();

    public Descompressor(Map<String, Integer> dicionario) {
        this.dicionario = dicionario;
        inverterDicionario();
    }

    private void inverterDicionario() {
        for (Map.Entry<String, Integer> entry : this.dicionario.entrySet()) {
            inverseDicionario.put(entry.getValue(), entry.getKey());
        }
    }

    public String descomprimir(String mensagem) {
        for (Integer integer : inverseDicionario.keySet()) {
            texto = mensagem.replaceAll("\\b" + String.valueOf(integer) + "\\b", inverseDicionario.get(integer));
            mensagem = texto;
        }
//        imprimir();
        return texto;
    }
    
//    public void imprimir(){
//        System.out.println("descomprimir");
//        for (Integer integer : inverseDicionario.keySet()) {
//            System.out.println(inverseDicionario.get(integer) +  " - " + integer);
//        }
//    }
}
