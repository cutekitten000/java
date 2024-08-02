

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("1984", "George Orwell", 328);
        Livro livro2 = new Livro("O senhor dos aneis", "J.R.R Tolkien", 1178);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();

        biblioteca.removerLivro("1984");

        biblioteca.listarLivros();
    }
}
