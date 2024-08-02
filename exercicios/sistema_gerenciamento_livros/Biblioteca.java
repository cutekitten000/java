import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro(String titulo) {
        Livro livroParaRemover = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroParaRemover = livro;
                break;
            }
        }

        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            System.out.println("Livro removido: " + livroParaRemover);
        } else {
            System.out.println("Livro com titulo '" + titulo + "' nao encontrado");
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Lista de livros");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
