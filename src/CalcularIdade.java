import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o mês de nascimento (1 a 12): ");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        LocalDate dataAtual = LocalDate.now();

        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

        Period periodo = Period.between(dataNascimento, dataAtual);

        int idadeAnos = periodo.getYears();
        int idadeMeses = periodo.getMonths();
        int idadeDias = periodo.getDays();

        System.out.printf("A idade da pessoa é: %d ano(s), %d mes(es) e %d dia(s)", idadeAnos, idadeMeses, idadeDias);
    }
}
