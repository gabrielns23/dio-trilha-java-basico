package model;

import java.util.Random;

public class ContaTerminal {

        private int numero;
        private String agencia;
        private String nomeCliente;
        private double saldo;

        public static void main(String[] args) {

        }

        public ContaTerminal(String agencia, String nomeCliente){
            this.numero = gerarNumeroConta();
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = 0;

        }
        public int getNumero() {
            return numero;
        }

        public String getAgencia() {
            return agencia;
        }

        public String getNomeCliente() {
            return nomeCliente;
        }

        public double getSaldo() {
            return saldo;
        }

        private int gerarNumeroConta() {
            Random random = new Random();
            int numeroMinimo = 1000;
            int numeroMaximo = 9999;

            return random.nextInt(numeroMaximo - numeroMinimo + 1) + numeroMinimo;
        }




}

