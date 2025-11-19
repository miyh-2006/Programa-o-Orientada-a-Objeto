package exemplos_collections;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> ListaNomes = new ArrayList<>();

        ListaNomes.add("Alice");
        ListaNomes.add("Bob");
        ListaNomes.add("Carol");
        
        for(String nome: ListaNomes){
            System.out.println(nome);
        }

        System.out.println(ListaNomes.get(1));

        if (ListaNomes.contains("Bob")) {
            System.out.println("Bob está na lista");
        }
        else {
            System.out.println("Bob não está na lista");
        }

        ListaNomes.remove("Bob");
        if (ListaNomes.contains("Bob")) {
            System.out.println("Bob está na lista");
        }
        else {
            System.out.println("Bob não está na lista");
        }
        if(ListaNomes.isEmpty()){
            System.out.println("A lista está vazia");
        }

        ListaNomes.clear();
        if(ListaNomes.isEmpty()){
            System.out.println("A lista está vazia");
        }
    }
}
