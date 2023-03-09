package estruturano;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<String>("Conteúdo do No 1"); // Versão antiga tinha que colocar tmb no new
        No<String> no2 = new No("Conteúdo do No 2");

        no1.setProximoNo(no2);

        No<String> no3 = new No("Conteúdo do No 3");
        no2.setProximoNo(no3);

        No<String> no4 = new No("Conteúdo do No 4");
        no3.setProximoNo(no4);

        // no1 -> no2 -> no3 -> no4 -> null (Acaba o encadeamento do nó)

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
