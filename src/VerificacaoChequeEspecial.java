import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saldo > saque) {
            System.out.println("Transacao realizada com sucesso.");

        }
        // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        else if (saque <= limiteChequeEspecial + saldo) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }
        else   {
            // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}