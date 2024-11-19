import java.util.Scanner;
public class atividade01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Olá! Eu sou o MiniChatbot. Como posso ajudar você hoje?");

            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine().toLowerCase();

                if (input.contains("olá") || input.contains("oi")) {
                    System.out.println("Oi! Tudo bem?");
                } else if (input.contains("ajuda")) {
                    System.out.println("Claro! Estou aqui para ajudar. O que você precisa?");
                } else if (input.contains("horas") || input.contains("tempo")) {
                    System.out.println("Desculpe, eu ainda não sei que horas são. :(");
                } else if (input.contains("adeus") || input.contains("tchau")) {
                    System.out.println("Tchau! Foi bom conversar com você. Até a próxima!");
                    break;
                } else {
                    System.out.println("Desculpe, não entendi. Pode tentar perguntar de outra forma?");
                }
            }

            scanner.close();
        }
}
