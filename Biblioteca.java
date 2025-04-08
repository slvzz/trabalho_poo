import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros;

    public Biblioteca (){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    } 

    public void emprestarLivro(Livro livro){
        for (Livro l: this.livros){
            if(l == livro){
                l.setDisponivel(false);
            }
        }

    }

    public void devolverLivro(Livro livro){
        for (Livro l: this.livros){
            if(l == livro){
                l.setDisponivel(true);
            }
        }

    }

    public ArrayList<Livro> listarLivros(){
        return this.livros;
    }

}   
