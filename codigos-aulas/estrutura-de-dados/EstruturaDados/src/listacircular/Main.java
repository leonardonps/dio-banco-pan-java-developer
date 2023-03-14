package listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);

        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");

        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        minhaListaCircular.add("c5");

        System.out.println(minhaListaCircular);
        System.out.printf(minhaListaCircular.get(0));
        System.out.printf(minhaListaCircular.get(15));
    }
}
