package set.exerciciospropostos.ex002;

import java.util.Comparator;

public class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());

        if(nome != 0){
            return nome;
        }

        int ano =  Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0){
            return ano;
        }

        return l1.getIDE().compareTo(l2.getIDE());
    }
}
