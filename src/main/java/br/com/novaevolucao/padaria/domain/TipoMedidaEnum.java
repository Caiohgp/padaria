package br.com.novaevolucao.padaria.domain;

public enum TipoMedidaEnum {
    GRAMA(1,"Grama"),
    UNIDADE(2, "Unidade");

    private int id;
    private String nome;

    TipoMedidaEnum(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}


