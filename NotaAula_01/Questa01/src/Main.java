import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Informe a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media < 4.0) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Final");
        }

        scanner.close();
    }
}
