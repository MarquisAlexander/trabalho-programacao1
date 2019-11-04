package contacorrente;

public class Movimentacao {
    int numero;
    String titular;
    double saldo;
   
    public Movimentacao(int numero,String nome,double saldo){
        this.numero=numero;
        this.titular=nome;
        this.saldo=saldo;
    }
    boolean sacar(double valor){
        if(valor>0){
            this.saldo-=valor;
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