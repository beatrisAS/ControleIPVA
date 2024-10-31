package controleipva;

/**
 *
 * @author beatris
 */
import java.util.Scanner;

public class ControleIPVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número final da placa ao usuário
        System.out.print("Digite o numero final da placa do veiculo (0 a 9): ");
        int placaFinal = scanner.nextInt();

        // Verificar o número da placa e exibir o mês correspondente ao pagamento do IPVA
        switch (placaFinal) {
            case 1:
                System.out.println("Pagamento do IPVA ate 30/04");
                break;
            case 2:
                System.out.println("Pagamento do IPVA ate 31/05");
                break;
            case 3:
                System.out.println("Pagamento do IPVA ate 30/06");
                break;
            case 4:
                System.out.println("Pagamento do IPVA ate 31/07");
                break;
            case 5:
                System.out.println("Pagamento do IPVA ate 31/08");
                break;
            case 6:
                System.out.println("Pagamento do IPVA ate 30/09");
                break;
            case 7:
                System.out.println("Pagamento do IPVA ate 31/10");
                break;
            case 8:
                System.out.println("Pagamento do IPVA ate 30/11");
                break;
            case 9:
            case 0:
                System.out.println("Pagamento do IPVA ate 31/12");
                break;
            default:
                System.out.println("Valor digitado esta incorreto. Digite um numero entre 0 e 9.");
        }

        scanner.close();
    }
}
