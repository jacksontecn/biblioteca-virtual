package model;

import interfaces.Emprestavel;

public class Jornal extends ItemBiblioteca {


    public Jornal(String titulo, String autor, int anoDePublicacao) {
        super(titulo, autor, anoDePublicacao);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Jornal -  Título: " + getTitulo());
    }

}
