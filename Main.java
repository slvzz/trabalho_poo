public class Main {
    public static void main(String[] args) {
    Livro livro1 = new Livro("testando testes", "silvio", true);
    Livro livro2 = new Livro("Romeu e julieta", "shakespeare", true);
    Livro livro3 = new Livro("documentario lua", "lua", true);

    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionarLivro(livro1);
    biblioteca.adicionarLivro(livro2);
    biblioteca.adicionarLivro(livro3);

    System.out.println(biblioteca.listarLivros());

    biblioteca.emprestarLivro(livro3);

    System.out.println(biblioteca.listarLivros());

    biblioteca.devolverLivro(livro3);

    System.out.println(biblioteca.listarLivros());
    }

    
}
