import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(vetor));

        Arrays.sort(vetor);

        System.out.println(Arrays.toString(vetor));

        int opcao;

        do {
            System.out.print("Digite o número que deseja buscar: ");
            int valor = scanner.nextInt();

            int resultado = Arrays.binarySearch(vetor, valor);

            switch (resultado >= 0 ? 1 : 0) {
                case 1:
                    System.out.println("Elemento encontrado na posição: " + resultado);
                    break;
                case 0:
                    System.out.println("Elemento não encontrado.");
                    break;
            }

            System.out.println("Deseja buscar novamente? 1-Sim 2-Não");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        scanner.close();
    }
}