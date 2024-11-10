package model;

import interfaces.Emprestavel;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

    public void listarItens(){
        for (ItemBiblioteca item: itens){
            item.mostrarInfo();
        }
    }

    public void listarItens(String autor){
        for (ItemBiblioteca item: itens){
            if (item.getAutor().equalsIgnoreCase(autor)){
                item.mostrarInfo();
            }
        }
    }


    public <T extends ItemBiblioteca> void listarItensPorTipo(Class<T> tipo) {
        for (ItemBiblioteca item : itens) {
            if (tipo.isInstance(item)) {
                T itemEspecifico = tipo.cast(item);
                itemEspecifico.mostrarInfo();
            }
        }
    }


    public void emprestarItem(ItemBiblioteca item){
        if (item instanceof Emprestavel){
            ((Emprestavel) item).emprestar();
        }else {
            System.out.println(item.getTitulo() + ": Item não pode ser emprestado");
        }
    }

    public void devolverItem(ItemBiblioteca item){
        if (item instanceof Emprestavel){
            ((Emprestavel) item).devolver();
        }else {
            System.out.println(item.getTitulo() + ": Item não pode ser emprestado");
        }
    }

    public void LivrosEmprestados(){
        System.out.println("---- Livros Emprestados ----");
        for (ItemBiblioteca itemBiblioteca : itens){
            if (itemBiblioteca instanceof Livro && ((Livro) itemBiblioteca).isEmprestado()){
                System.out.println("Título: " + itemBiblioteca.getTitulo());
            }
        }
    }

    public void LivrosDisponiveis(){
        System.out.println("---- Livros Disponiveis ----");
        for (ItemBiblioteca itemBiblioteca : itens){
            if (itemBiblioteca instanceof Livro && !((Livro) itemBiblioteca).isEmprestado()){
                System.out.println("Título: " + itemBiblioteca.getTitulo());
            }
        }
    }

}
