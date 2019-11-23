package contacorrente;

public class Movimentacao {
    int numero, saques, depositos;
    String titular;
    double saldo;
    double saldoc;
   
    public Movimentacao(int numero,String nome,double saldo,double saldoc){
        this.numero=numero;
        this.titular=nome;
        this.saldo=saldo;
        this.saldoc=saldoc;
        saques=0;
    }
    /*boolean sacarc (double valorc){
        if(valorc<=saldoc){
            this.saldoc-=valorc;
            System.out.println("Saldo removido do crédito disponivel");
            return true;
        }else{
            System.out.println("Não tem crédito");
            return false;
        }
    }*/
     double sacar(double valor, double valorc){
        if(valor<=saldo){
            this.saldo-=valor;
            saques++;
            return 1;
        }else{
            this.saldoc-=valor;
            saques++;
            return 0;
        }
    }

    double getCredito(){
        return saldoc;
    }
    boolean setCredito(double valorc){
        if(valorc>0){
            this.saldoc+=valorc;
            return true;
        }else{
            return false;
        }
    }
    double getSaldo(){
        return saldo;
    }
    boolean setSaldo(double valor){
        if(valor>0){
            this.saldo+=valor;
            depositos++;
            return true;
        }else{
            return false;
        }
    }
    int getNumero(){
        return numero;
    }
    String getTitular(){
        return titular;
    }
}