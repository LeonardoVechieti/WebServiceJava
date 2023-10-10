package model;

public class Album {
    private String nome;
    private String produtoras;
    private int ano;

    public Album(String nome, String produtoras, int ano) {
        this.nome = nome;
        this.produtoras = produtoras;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProdutoras() {
        return produtoras;
    }

    public void setProdutoras(String produtoras) {
        this.produtoras = produtoras;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
