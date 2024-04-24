import model.ContaTerminal;

import java.util.Scanner;
//        private int numero;
//        private String agencia;
//        private String nomeCliente;
//        private double saldo;
public class Main {
    static ContaTerminal conta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo, vamos começar o se cadastro?: \n");
        System.out.println("********************************************* \n");


        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        conta = new ContaTerminal(agencia, nomeCliente);

        System.out.println("Olá ".concat(conta.getNomeCliente()).concat(", obrigado por criar uma conta em nosso banco. sua agência é ")
                .concat(conta.getAgencia()).concat(", conta ").concat(String.valueOf(conta.getNumero()))
                .concat(" e seu saldo ").concat(String.valueOf(conta.getSaldo())).concat(" já está disponível para saque. "));


    }
}