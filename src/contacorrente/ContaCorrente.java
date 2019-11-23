package contacorrente;

import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        boolean continuar=true;
        String execucao,nome;
        int nconta,numero,escolha;
        Movimentacao c=null;
        double saldoinicial, saldoinicialc, valor, valorc = 0;
       
        while(continuar==true){
//Menu inicial da aplicação
            System.out.println("Digite 1 para criar conta, "
                    + "2 para sacar, 3 para depositar, 4 para ver"
                    + " o saldo e 5 para ver extrato geral da conta: ");
            escolha = in.nextInt();
//criando uma nova conta no banco
            if(escolha==1){           
                System.out.println("Digite o nome do titular: ");
                nome = in.next();
                System.out.println("Digite o número da sua conta: ");
                numero = in.nextInt();
                System.out.println("Digite o depósito inicial: ");
                saldoinicial = in.nextDouble();
                System.out.println("Digite o valor que deseja para o crédito:");
                saldoinicialc = in.nextDouble();
                c = new Movimentacao(numero,nome,saldoinicial,saldoinicialc);
                System.out.println("Saldo atual: "+c.getSaldo());
                System.out.println("Saldo atual de crédito: "+c.getCredito());
                System.out.println(" ");
            }
//definindo um valor para sacar
            if(escolha==2){
                System.out.println("Digite o valor que deseja sacar: ");
                valor = in.nextDouble();
                /*System.out.println("Confirme o valor que deseja sacar:  ");
                valorc = in.nextDouble();*/
                double saque_efetuado = c.sacar(valor, valorc);
                if (saque_efetuado==1){
                    System.out.println("Transferencia realizada com sucesso!");
                    System.out.println("Saldo atual: "+c.getSaldo());
                    System.out.println(" ");
                    
                }
                if(saque_efetuado==0){
                    System.out.println("saldo removido do crédito! ");
                    System.out.println(" ");
                    System.out.println("Saldo atual de crédito: "+c.getCredito());
                    System.out.println(" ");
                }
                /*boolean tirar_debito = c.sacarc(valor);
                if (tirar_debito==true){  
                    System.out.println("Saldo atual em crédito: "+c.getCredito());
                }*/
            }
//definindo um valor para depositar
            if(escolha==3){
                System.out.println("Digite o valor que deseja depositar: ");
                valor = in.nextDouble();
                boolean deposito_efetuado = c.setSaldo(valor);
                if(deposito_efetuado==true){
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atual: "+c.getSaldo());
                    System.out.println(" ");
                }
               else{
                System.out.println("Valor inválido.");
                System.out.println(" ");
                }
            }
//mostrando apenas o saldo
            if(escolha==4){
                System.out.println("Saldo atual: "+c.getSaldo());
                System.out.println(" ");
            }
//mostrando todas as informações da conta
            if(escolha==5){
                System.out.println("Titular da conta: "+c.getTitular());
                System.out.println("Número da conta: "+c.getNumero());
                System.out.println("Saldo atual: "+c.getSaldo());
                System.out.println("Saldo atual em crédito: "+c.getCredito());
                System.out.println("Saques realizados hoje: " + c.saques);
                System.out.println("Depositos realizados hoje:" + c.depositos + "\n");
                System.out.println(" ");
            }
//perguntando se deseja finalizar ou continuar na aplicação
            System.out.println(" ");
            System.out.println ("Deseja continuar? s - sim/ n - não");
            System.out.println(" ");
            execucao = in.next();
            if(execucao.equals("n")){
                System.out.println(" ");
                System.out.println("Operações finalizadas pelo usuário");
                continuar=false;
            }
    }
    }
}