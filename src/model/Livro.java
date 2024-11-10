package model;

import interfaces.Emprestavel;

public class Livro extends ItemBiblioteca implements Emprestavel {

    private boolean emprestado;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        super(titulo, autor, anoDePublicacao);
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado){
            emprestado = true;
        } else{
            System.out.println("Livro já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado){
            emprestado = false;
            System.out.println("Livro devolvido: " + getTitulo());
        }else {
            System.out.println("Livro não está emprestado.");
        }

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Livro -  Título: " + getTitulo());
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}
