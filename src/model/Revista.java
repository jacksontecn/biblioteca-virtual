package model;

import interfaces.Emprestavel;

public class Revista extends ItemBiblioteca {


    public Revista(String titulo, String autor, int anoDePublicacao) {
        super(titulo, autor, anoDePublicacao);

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Revista -  Título: " + getTitulo());
    }

}
