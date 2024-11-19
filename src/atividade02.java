import java.util.Scanner;

public class atividade02 {

        private static double saldo = 0.0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                exibirMenu();
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> adicionarSaldo(scanner);
                    case 2 -> realizarPagamento(scanner);
                    case 3 -> verificarSaldo();
                    case 0 -> System.out.println("Obrigado por usar a carteira digital. Até mais!");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);

            scanner.close();
        }


        private static void exibirMenu() {
            System.out.println("\n=== Carteira Digital ===");
            System.out.println("1. Adicionar Saldo");
            System.out.println("2. Realizar Pagamento");
            System.out.println("3. Verificar Saldo");
            System.out.println("0. Sair");
        }


        private static void adicionarSaldo(Scanner scanner) {
            System.out.print("Digite o valor para adicionar ao saldo: ");
            double valor = scanner.nextDouble();
            if (valor > 0) {
                saldo += valor;
                System.out.printf("Valor de R$%.2f adicionado com sucesso!\n", valor);
            } else {
                System.out.println("Valor inválido. O saldo deve ser positivo.");
            }
        }

        private static void realizarPagamento(Scanner scanner) {
            System.out.print("Digite o valor do pagamento: ");
            double valor = scanner.nextDouble();
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.printf("Pagamento de R$%.2f realizado com sucesso!\n", valor);
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente para realizar o pagamento.");
            } else {
                System.out.println("Valor inválido. O pagamento deve ser positivo.");
            }
        }

        private static void verificarSaldo() {
            System.out.printf("Seu saldo disponível é: R$%.2f\n", saldo);
        }
}
