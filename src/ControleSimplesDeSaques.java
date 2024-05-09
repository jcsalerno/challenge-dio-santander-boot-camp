import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop 'for' para iterar sobre os saques
        for (int i = 0; ; i++) {
            // Solicite ao usuário o valor do saque
            double valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            }

            // Verifique se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            }

            // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário
            limiteDiario -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
