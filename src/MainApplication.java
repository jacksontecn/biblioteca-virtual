import model.*;

public class MainApplication {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        // 10 Instâncias de Livros
        Livro livro1 = new Livro("Java para Iniciantes", "Autor A", 2022);
        Livro livro2 = new Livro("Estruturas de Dados", "Autor B", 2021);
        Livro livro3 = new Livro("Algoritmos em Java", "Autor C", 2019);
        Livro livro4 = new Livro("Programação Orientada a Objetos", "Autor D", 2020);
        Livro livro5 = new Livro("Design Patterns", "Autor E", 2018);
        Livro livro6 = new Livro("Engenharia de Software", "Autor A", 2017);
        Livro livro7 = new Livro("Banco de Dados Relacional", "Autor G", 2020);
        Livro livro8 = new Livro("Introdução à Inteligência Artificial", "Autor A", 2021);
        Livro livro9 = new Livro("Machine Learning em Java", "Autor I", 2019);
        Livro livro10 = new Livro("Estrutura de Computadores", "Autor J", 2018);

        // 10 Instâncias de Revistas
        ItemBiblioteca revista1 = new Revista("Revista de Tecnologia", "Editor A", 2023);
        ItemBiblioteca revista2 = new Revista("Ciência Atual", "Editor B", 2022);
        ItemBiblioteca revista3 = new Revista("Engenharia Hoje", "Editor C", 2021);
        ItemBiblioteca revista4 = new Revista("Mundo Programação", "Editor D", 2020);
        ItemBiblioteca revista5 = new Revista("Robótica e IA", "Editor E", 2022);
        ItemBiblioteca revista6 = new Revista("Software Livre", "Editor F", 2023);
        ItemBiblioteca revista7 = new Revista("Inovação e Pesquisa", "Editor C", 2021);
        ItemBiblioteca revista8 = new Revista("Desenvolvimento de Games", "Editor H", 2019);
        ItemBiblioteca revista9 = new Revista("Tecnologia Sustentável", "Editor I", 2020);
        ItemBiblioteca revista10 = new Revista("Revista de Dados", "Editor C", 2018);

        // 10 Instâncias de Jornais
        ItemBiblioteca jornal1 = new Jornal("Jornal da Manhã", "Editor C", 2024);
        ItemBiblioteca jornal2 = new Jornal("Diário de Notícias", "Editor L", 2024);
        ItemBiblioteca jornal3 = new Jornal("O Globo Tecnológico", "Editor M", 2023);
        ItemBiblioteca jornal4 = new Jornal("Folha Científica", "Editor N", 2023);
        ItemBiblioteca jornal5 = new Jornal("Notícias do Futuro", "Editor O", 2024);
        ItemBiblioteca jornal6 = new Jornal("Semana em Revista", "Editor C", 2023);
        ItemBiblioteca jornal7 = new Jornal("Caderno de Pesquisa", "Editor Q", 2023);
        ItemBiblioteca jornal8 = new Jornal("Diário de Engenharia", "Editor R", 2022);
        ItemBiblioteca jornal9 = new Jornal("Inovação Hoje", "Editor C", 2023);
        ItemBiblioteca jornal10 = new Jornal("Gazeta Científica", "Editor T", 2022);

        // Adicionando todos os itens à biblioteca
        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(livro3);
        biblioteca.adicionarItem(livro4);
        biblioteca.adicionarItem(livro5);
        biblioteca.adicionarItem(livro6);
        biblioteca.adicionarItem(livro7);
        biblioteca.adicionarItem(livro8);
        biblioteca.adicionarItem(livro9);
        biblioteca.adicionarItem(livro10);

        biblioteca.adicionarItem(revista1);
        biblioteca.adicionarItem(revista2);
        biblioteca.adicionarItem(revista3);
        biblioteca.adicionarItem(revista4);
        biblioteca.adicionarItem(revista5);
        biblioteca.adicionarItem(revista6);
        biblioteca.adicionarItem(revista7);
        biblioteca.adicionarItem(revista8);
        biblioteca.adicionarItem(revista9);
        biblioteca.adicionarItem(revista10);

        biblioteca.adicionarItem(jornal1);
        biblioteca.adicionarItem(jornal2);
        biblioteca.adicionarItem(jornal3);
        biblioteca.adicionarItem(jornal4);
        biblioteca.adicionarItem(jornal5);
        biblioteca.adicionarItem(jornal6);
        biblioteca.adicionarItem(jornal7);
        biblioteca.adicionarItem(jornal8);
        biblioteca.adicionarItem(jornal9);
        biblioteca.adicionarItem(jornal10);

        // Listar todos os itens da biblioteca
//        biblioteca.listarItens();

//        biblioteca.listarItensPorTipo(Livro.class);

//        biblioteca.listarItens("autor a");

        biblioteca.emprestarItem(livro2);
        biblioteca.emprestarItem(livro4);
        biblioteca.emprestarItem(livro6);
        biblioteca.emprestarItem(livro8);
        biblioteca.emprestarItem(livro10);

        biblioteca.emprestarItem(jornal2);
        System.out.println();
        biblioteca.emprestarItem(jornal6);


        biblioteca.LivrosEmprestados();
        System.out.println();
        biblioteca.LivrosDisponiveis();

        System.out.println("----------------------------");
        biblioteca.devolverItem(livro4);
        biblioteca.devolverItem(livro4);
        biblioteca.devolverItem(livro8);

        biblioteca.LivrosEmprestados();
        System.out.println();
        biblioteca.LivrosDisponiveis();


    }
}
