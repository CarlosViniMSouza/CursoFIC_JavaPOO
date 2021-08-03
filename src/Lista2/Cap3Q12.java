package Lista2;

import java.util.Scanner;

public class Cap3Q12 {

    public static void main(String []args) {

        /*

        Modifique a classe Account(Figura 3.13) para fornecer um metodo chamado 'debito' que retira dinheiro
        de uma Account. Assegure que a quantidade de 'debito' nao exceda o saldo de Account. Se exceder,
        o saldo deve ser deixado inalterado e o metodo deve imprimir uma mensagem que indica "Debito"
        amount exceeded account balance" [Quantia de debito excedeu o saldo da conta].

        Modifique a classe AccountTest (Figura 3.14) para testar o metodo debito.

         */

        /*

        // Figura 3.13: Account.java
        // classe Account com um construtor para validar e
        // inicializa a variavel de instancia balance do tipo double.

        public class Account {

            // construtor:
            public Account( double initialBalance ) {
                //valida a condicao de initialBalance --> Deve ser maior que 0:
                if ( initialBalance > 0.0 )
                    balance = initialBalance;
            }

            // adiciona uma certa quantia na Account:
            public void credit ( double amount ) {

                balance = balance + amount;
            }

            // retorna o saldo da Account:
            public double getBalance() {

                return balance; // fornece o valor dp saldo.
            }
            // A classe account com um construtor para validar e inicializar a variável de
            // instancia 'balance' do tipo 'double'.
        }

         */

        class Account {

            private double balance;

            public Account( double initialBalance ) {
                //valida a condicao de initialBalance, que deve ser maior que 0:
                if ( initialBalance > 0.0 ) {
                    balance = initialBalance;
                }
            }

            /*
            public void credit ( double amount ) {

                balance = balance + amount;
            }
            */

            // retira uma certa quantia na Account:
            public void debit() {

                double due;

                Scanner input = new Scanner( System.in );
                System.out.print("Insira a divida: ");
                due = input.nextDouble();

                if ( balance < due ) {
                    System.out.println("Quantia de debito excedeu o saldo da conta");
                } else {
                    System.out.println("Seu saldo esta OK !");
                    balance = balance - due;
                }
            }

            // retorna o saldo da Account:
            public double getBalance() {

                return balance;
            }
            // A classe account com um construtor para validar e inicializar a variável de
            // instancia 'balance' do tipo 'double'.
        }

        Account myAccount = new Account(500);

        System.out.println("Seu saldo eh = " + myAccount.getBalance());

        myAccount.debit();

        System.out.println("Seu saldo agora eh = " + myAccount.getBalance());

    }
}
