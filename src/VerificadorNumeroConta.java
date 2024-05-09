import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário que digite o número da conta bancária
            String numeroConta = scanner.nextLine();

            // Chama o método verificarNumeroConta para verificar se o número da conta tem exatamente 8 dígitos
            verificarNumeroConta(numeroConta);

            // Se nenhum erro ocorrer, imprime que o número de conta é válido
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            // Captura a exceção IllegalArgumentException e imprime uma mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }

    // Método que verifica se o número da conta tem exatamente 8 dígitos
    private static void verificarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (numeroConta.length() != 8) {
            // Se o número de dígitos for diferente de 8, lança uma exceção IllegalArgumentException
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
