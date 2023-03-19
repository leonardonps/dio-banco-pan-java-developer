package set.exerciciospropostos.ex002;

import set.aula.Serie;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    String nome;
    int anoDeCriacao;
    String IDE;

    public LinguagemFavorita(String nome, int anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(IDE, that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }


    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareTo(linguagemFavorita.getNome());
    }
}
