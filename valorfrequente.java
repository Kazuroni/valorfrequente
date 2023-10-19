package valorfrequente;

import java.util.Scanner;

public class valorfrequente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do array
        int tamanhoArray = 10;

        // Cria um array para armazenar os números inseridos pelo usuário
        int[] numeros = new int[tamanhoArray];

        // Solicita ao usuário inserir 10 números
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Encontra o valor mais frequente e sua frequência
        int valorMaisFrequente = encontrarValorMaisFrequente(numeros);
        int frequencia = contarFrequencia(numeros, valorMaisFrequente);

        // Imprime o valor mais frequente e sua frequência
        System.out.println("O valor mais frequente é " + valorMaisFrequente + " com frequência de " + frequencia + " vezes.");

        scanner.close();
    }

    // Função para encontrar o valor mais frequente em um array
    public static int encontrarValorMaisFrequente(int[] numeros) {
        int valorMaisFrequente = 0;
        int frequenciaMaxima = 0;

        for (int i = 0; i < numeros.length; i++) {
            int frequenciaAtual = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frequenciaAtual++;
                }
            }

            if (frequenciaAtual > frequenciaMaxima) {
                frequenciaMaxima = frequenciaAtual;
                valorMaisFrequente = numeros[i];
            }
        }

        return valorMaisFrequente;
    }

    // Função para contar a frequência de um valor em um array
    public static int contarFrequencia(int[] numeros, int valor) {
        int frequencia = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                frequencia++;
            }
        }

        return frequencia;
    }
}
