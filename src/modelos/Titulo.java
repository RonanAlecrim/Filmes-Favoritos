package br.com.filmesfavoritos.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo() {

    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getduracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "(nome = '" + nome + '\'' +
                ", anoDeLancamento = " + anoLancamento + ", duração = " + duracaoEmMinutos + ")";
    }
}
