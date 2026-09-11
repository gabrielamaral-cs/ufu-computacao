package POO.pratica2;

public class Conta {
    String nome;
    double saldo;
    boolean especial;
    
    public int depositar(double valor){
        if (valor <0){
            System.out.println("Não é possivel fazer um deposito negativo");
            return 1;
        }

        saldo = saldo + valor;
        System.out.println("Deposito feito com sucesso");
        return 0;
    }

    public int sacar(double valor){
        if(valor < 0){
            System.out.println("não é possivel sacar um valor negativo");
            return 1;
        }
        if(especial == false && (saldo - valor) < 0){
            System.out.println("O cliente não tem permissão para sacar mais do que possui");
            return 1;
        }
        if(especial == true && (saldo - valor)<0){
            saldo = saldo - valor;
            System.out.println("Saque realizado, mas saldo está negativo!");
            return 0;
        }
        saldo = saldo - valor;
        System.out.println("Saque realizado com sucesso");
        return 0;
    }

    public double mostrarSaldo(){
        return saldo;
    }

    public int transferir(Conta conta, double valor){
        if(valor<0){
            System.out.println("Não é possivel transferir um valor negativo");
            return 1;
        }
        if(especial == false && (saldo - valor)<0){
            System.out.println("O cliente não tem permissão para realizar uma transferencia maior que seu saldo");
            return 1;
        }
        if (especial == true && (saldo - valor)<0){
            conta.saldo = conta.saldo + valor;
            saldo = saldo - valor;
            System.out.println("Transferencia realizada, mas saldo negativo");
            return 0;
        }
        conta.saldo = conta.saldo + valor;
        saldo = saldo - valor;
        System.out.println("Transferencia realizada com sucesso");
        return 0;
    }
}
