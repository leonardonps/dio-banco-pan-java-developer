package listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaDupEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDupEncadeada.add("c1");
        minhaListaDupEncadeada.add("c2");
        minhaListaDupEncadeada.add("c3");
        minhaListaDupEncadeada.add("c4");
        minhaListaDupEncadeada.add("c5");
        minhaListaDupEncadeada.add("c6");
        minhaListaDupEncadeada.add("c7");

        System.out.println(minhaListaDupEncadeada);

        minhaListaDupEncadeada.remove(3);

        System.out.println(minhaListaDupEncadeada);

        minhaListaDupEncadeada.add(3, "99");

        System.out.println(minhaListaDupEncadeada);

        System.out.println(minhaListaDupEncadeada.get(3));

    }
}
