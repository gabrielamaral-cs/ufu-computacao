package POO.pratica2;

public class main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.nome = "Gabriel";
        conta1.saldo = 1000.00;
        conta1.especial = false;

        conta2.nome = "André";
        conta2.saldo = 500.00;
        conta2.especial = true;

        conta1.depositar(15.00);
        System.out.println(conta1.mostrarSaldo());
        conta1.sacar(500.00);
        System.out.println(conta1.mostrarSaldo());
        conta1.sacar(600.00);
        conta1.transferir(conta2, 300.00);
        conta1.transferir(conta2, 900.00);
        System.out.println(conta1.mostrarSaldo());
        
        System.out.println("====================================");

        System.out.println(conta2.mostrarSaldo());
        conta2.sacar(1000.00);
        System.out.println(conta2.mostrarSaldo());
    }
    
}
