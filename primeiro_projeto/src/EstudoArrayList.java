import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamao");
        listaDeCompras.add("Sabao em po");
        listaDeCompras.add("Macarrao");

        listaDeCompras.add(1, "Banana");
        for(String item: listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("na posicao 3 eu tenho: " + item);
//        listaDeCompras.remove("Sabao em po");
        listaDeCompras.remove(2);

        for(String item2: listaDeCompras){
            System.out.println("lista de compras 2:" + item2);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("Lista vazia ? " + eVazia + "O tamanho da sua lista e:" + tamanho+ "A sua lista contem: "
                + contem);

//        listaDeCompras.clear();
//        System.out.println("A lista vazia ?" + listaDeCompras.isEmpty());

        listaDeCompras.forEach((produto -> System.out.println(produto)));
    }
}
