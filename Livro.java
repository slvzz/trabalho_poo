public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;

    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Boolean getDisponivel(){
        return this.disponivel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {

        String disponibilidade;

        if (getDisponivel()){
            disponibilidade = "sim";
        } else {
            disponibilidade = "nao";
        }

        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\n Disponibilidade: " + disponibilidade;
    }
}


