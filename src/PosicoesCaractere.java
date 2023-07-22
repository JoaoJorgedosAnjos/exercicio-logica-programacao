import java.util.Scanner;

public class PosicoesCaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite um caractere: ");
        char caractere = scanner.nextLine().charAt(0);

        StringBuilder posicoes = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caractere) {
                posicoes.append(i).append(" ");
            }
        }

        if (posicoes.length() > 0) {
            System.out.printf("O caractere '%s' ocorre nas posições: %s\n", caractere, posicoes);
        } else {
            System.out.printf("O caractere '%s' não foi encontrado na frase.", caractere);
        }
    }
}