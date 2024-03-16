package inversao;

import java.util.Scanner;

public class StringReversa {
    public static void main(String[] args) {
        StringReversa sr = new StringReversa();
        sr.inverterString();
    }
    Scanner sc = new Scanner(System.in);

    public void inverterString() {
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}
