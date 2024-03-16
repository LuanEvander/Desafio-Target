package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual número deseja somar?");
        int entrada = sc.nextInt();

        if (isFibonacciNum(entrada)) {
            System.out.println("O número " + entrada + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + entrada + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacciNum(int n) {
        int anterior = 0;
        int atual = 1;

        while (atual < n) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == n;
    }
}
