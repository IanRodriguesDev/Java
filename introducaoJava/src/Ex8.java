import java.util.Objects;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Ian Carlos Rodrigues de Almeida";
        String tipoConta = "Conta corrente";
        boolean flag = true;
        int saldoConta = 2500;
        int limite = 2000;
        int saque = 0;
        int transferencia = 0;

        while(flag){
            String cliente = "*********************************************************\n" + "Nome do Cliente: " + nomeCliente + "\nTipo da conta:   " + tipoConta + "\nSaldo da conta:  "
                    + saldoConta + "\n*********************************************************";
            System.out.println(cliente);
            String opcoes = "Operações:\n" + "1- Consultar Saldos \n" + "2- Receber Valor\n" + "3- Transferir Valor\n" + "4- Sair\n" + "Qual sua operação desejada? \n";
            System.out.println(opcoes);
            String escolha = scanner.nextLine();

            if (Objects.equals(escolha, "1")) {
                System.out.println("\n*********************************************************\n" + "Seu saldo atualmente é R$" + saldoConta + "\nLimite para emprestimo: "  + limite + "\n1- Voltar para o inicio\n" + "2- Finalizar sessão");
                escolha = scanner.nextLine();
                if (Objects.equals(escolha, "2")) {
                    System.out.println("Sessão finalizada");
                    break;
                } else if (Objects.equals(escolha, "1")) {
                    boolean flag1 = flag;
                    flag1 = false;

                } else if(!(Objects.equals(escolha, "2"))) {
                    System.out.println("Não entendi sua solicitação, sessão finaliada!");
                    break;
                }
            }

            if (Objects.equals(escolha, "2")) {
                System.out.println("\n*********************************************************\n" +   "Digite 's' para finalizar a sessão.\n" +"Quanto voce deseja sacar? ");
                saque = scanner.nextInt();
                if (Objects.equals(saque, "s")) {
                    System.out.println("Sessão finalizada");
                    break;
                }  else if (saque <= 0 || saque > saldoConta)  {
                    System.out.println("Saldo insuficiente ou valor inesistente.\nSessão finalizada!");
                    break;
                } else {
                    saldoConta = saldoConta - saque;
                    System.out.println("Saldo atualizado com sucesso!" + "\nSaldo atual: " + saldoConta);
                }
            }

            if (Objects.equals(escolha, "3")) {
                System.out.println("\n*********************************************************\n" +   "Digite 's' para finalizar a sessão.\n" +"Quanto voce deseja transferir? ");
                transferencia = scanner.nextInt();
                if (Objects.equals(transferencia, "s")) {
                    System.out.println("Sessão finalizada");
                    break;
                }  else if (transferencia <= 0 || transferencia > saldoConta ) {
                    System.out.println("Saldo insuficiente ou valor inesistente.\nSessão finalizada!");
                    break;
                } else {
                    saldoConta = transferencia - saldoConta;
                    System.out.println("Saldo atualizado com sucesso!" + "\nSaldo atual: " + saldoConta);
                }
            }
            if (Objects.equals(escolha, "4")) {
                System.out.println("Sessão finalizada!");
                break;
            }
        }
    }
}




