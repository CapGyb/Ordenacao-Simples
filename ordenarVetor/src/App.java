import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[10];
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor do vetor na posicao " + (i + 1) + ": ");
            vetor[i] = teclado.nextInt();

        }
        teclado.close();

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;

                }
            }
        }

        System.out.println("O vetor ordenado em crescente: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);

        }
        System.out.println();

    }
}
