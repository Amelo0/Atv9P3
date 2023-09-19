package P3.Ficha09;

class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}

public class questao3 {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno("João", 101, new double[] { 8.5, 7.0, 9.5 });
        alunos[1] = new Aluno("Maria", 102, new double[] { 6.0, 6.5, 5.5 });
        alunos[2] = new Aluno("Pedro", 103, new double[] { 7.5, 8.0, 7.0 });

        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getStatus().equals("Aprovado")) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            }
        }

        System.out.println("\nAlunos Reprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getStatus().equals("Reprovado")) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            }
        }
    }
}
