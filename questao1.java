package P3.Ficha09;
import java.util.Scanner;
import java.util.ArrayList;

class Funcionario{
    //Declarações
    private String nome;
    private Double salarioAtual;
    private int idade;

    //Construtores
    public Funcionario(String nome, Double salarioAtual, int idade) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
        this.idade = idade;
    }

    public Funcionario() {

    }

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(Double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioAtual=" + salarioAtual +
                ", idade=" + idade +
                '}';
    }
}

public class questao1{
    public static void main(String[] args){
        double sal;
        Scanner in = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

        for (int i = 0; i < 5; i++){
            Funcionario funcionario = new Funcionario();

            System.out.println("Qual o nome do funcionario?");
            funcionario.setNome(in.nextLine());

            in.nextLine();

            System.out.println("Qual o salario do funcionario?");
            funcionario.setSalarioAtual(in.nextDouble());

            in.nextLine();

            System.out.println("Qual a idade do funcionario?");
            funcionario.setIdade(in.nextInt());

            lista.add(funcionario);
        }

        for (Funcionario funcionario : lista)
            if (funcionario.getSalarioAtual() >= 50000 && funcionario.getIdade() < 30) {
                System.out.println(funcionario.toString());

            }
    }//end of main
}
