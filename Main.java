public class Main {
    public static void main(String[] args) {
    Livro livro1 = new Livro("Teste", "silvio", true);
    Livro livro2 = new Livro("Romeu e julieta", "guzera", true);
    Livro livro3 = new Livro("Sexo", "lua", true);

    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionarLivro(livro1);
    biblioteca.adicionarLivro(livro2);
    biblioteca.adicionarLivro(livro3);

    System.out.println(biblioteca.listarLivros());
    }

    
}
