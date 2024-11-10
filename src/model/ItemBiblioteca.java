package model;

public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public ItemBiblioteca(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public abstract void mostrarInfo();


}
