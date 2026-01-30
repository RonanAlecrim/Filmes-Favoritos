package br.com.filmesfavoritos.modelos;

public class Filme extends Titulo{
    private String diretor;

    public Filme(){
    }

    public Filme(String nome, String diretor, int anoLancamento){
        super(nome, anoLancamento);
        this.diretor = diretor;
    }

    public Filme(FilmeOMDB filmeOMDB) {
        super(filmeOMDB.title(), Integer.parseInt(filmeOMDB.year()));
        this.diretor = filmeOMDB.director();
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "(nome = '" + getNome() + '\''+
                ", diretor = " + diretor + ", anoLancamento = "+ getAnoLancamento() + ")";
    }


}
