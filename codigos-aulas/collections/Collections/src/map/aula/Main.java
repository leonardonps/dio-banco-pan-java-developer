package map.aula;

import map.aula.ComparatorNome;
import map.aula.Livro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
//        Map<String, Double> carrosPopulares1 = new HashMap<>(){{
//           put("gol", 14.4);
//           put("uno", 15.6);
//           put("mobi", 16.1);
//           put("hb20", 14.5);
//           put("kwid", 15.6);
//        }};
//        System.out.println(carrosPopulares1.toString());
//
//        System.out.println("Substitua o consumo do gol por 15.2 km/l");
//        carrosPopulares1.put("gol", 16.1);
//        System.out.println(carrosPopulares1);
//
//        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares1.containsValue("tucson"));
//
//        System.out.println("Exiba o consumo do uno: " + carrosPopulares1.get("uno"));
//
//        System.out.println("Exiba os modelos: ");
//        Set<String> modelos = carrosPopulares1.keySet();
//        System.out.println(modelos);
//
//        System.out.println("Exiba os consumos dos carros: ");
//        Collection<Double> consumos = carrosPopulares1.values();
//        System.out.println(consumos);
//
//        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
//        Double consumoMaisEficiente = Collections.max(carrosPopulares1.values());
//        Set<Map.Entry<String, Double>> entries = carrosPopulares1.entrySet();
//        String modeloMaisEficiente = "";
//
//        for(Map.Entry<String, Double> entry: entries){
//            if(entry.getValue().equals(consumoMaisEficiente)){
//                modeloMaisEficiente = entry.getKey();
//                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
//            }
//        }
//
//        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
//        Double consumoMenosEficiente = Collections.min(carrosPopulares1.values());
//        String modeloMenosEficiente = "";
//        for(Map.Entry<String, Double> entry: carrosPopulares1.entrySet()){
//            if(entry.getValue().equals(consumoMenosEficiente)){
//                modeloMenosEficiente = entry.getKey();
//                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
//            }
//        }
//
//        System.out.println("Exiba a soma dos consumos: ");
//        Iterator<Double> iterator = carrosPopulares1.values().iterator();
//        Double soma = 0d;
//        while(iterator.hasNext()){
//            soma += iterator.next();
//        }
//
//        System.out.println("Exiba a soma dos consumos: " + soma);
//
//        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares1.size()));
//
//        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
//        Iterator<Double> iterator1 = carrosPopulares1.values().iterator();
//        while(iterator1.hasNext()){
//            if(iterator1.next().equals(15.6)){
//                iterator1.remove();
//            }
//        }
//
//        System.out.println(carrosPopulares1);
//
//        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
//            put("gol", 14.4);
//            put("uno", 15.6);
//            put("mobi", 16.1);
//            put("hb20", 14.5);
//            put("kwid", 15.6);
//        }};
//        System.out.println(carrosPopulares2.toString());
//
//        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
//        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares1);
//        System.out.println(carrosPopulares3.toString());
//
//        System.out.println("Apague o dicionário de carros: ");
//        carrosPopulares1.clear();
//
//        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares1.isEmpty());

        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros1 = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 200));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 200));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 200));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 200));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\t Ordem alfabética autores\t--");
        Map<String, Livro> meusLivros3= new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros3.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());meusLivros4.addAll(meusLivros1.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros4){
           System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem pelo número de páginas\t--");
    }
}
