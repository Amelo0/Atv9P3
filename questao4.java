package P3.Ficha09;

public class questao4 {
    public class Livro {
        private String titulo;
        private String autor;
        private boolean disponivel;

        public Livro(String titulo, String autor, boolean disponivel) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = disponivel;
        }

        public String verificarDisponibilidade() {
            if (disponivel) {
                return "o livro \"" + titulo.toLowerCase() + "\" de " + autor.toLowerCase() + " está disponível para empréstimo.";
            } else {
                return "o livro \"" + titulo.toLowerCase() + "\" de " + autor.toLowerCase() + " não está disponível para empréstimo.";
            }
        }

        public void setDisponibilidade(boolean disponivel) {
            this.disponivel = disponivel;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public boolean isDisponivel() {
            return disponivel;
        }
    }

    public class Biblioteca {
        public void main(String[] args) {
            Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true);
            Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", false);

            System.out.println(livro1.verificarDisponibilidade());
            System.out.println(livro2.verificarDisponibilidade());

            // Alterando a disponibilidade do livro2
            livro2.setDisponibilidade(true);

            System.out.println("\nDepois de alterar a disponibilidade do livro2:");
            System.out.println(livro1.verificarDisponibilidade());
            System.out.println(livro2.verificarDisponibilidade());
        }
    }






}
