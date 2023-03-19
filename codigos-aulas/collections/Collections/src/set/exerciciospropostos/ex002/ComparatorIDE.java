package set.exerciciospropostos.ex002;

import set.aula.Serie;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
       return l1.getIDE().compareTo(l2.getIDE());
    }
}
