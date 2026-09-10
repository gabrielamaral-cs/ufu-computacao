package POO.pratica1.ex2;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.print("Escreva seu nome: ");
        p.nome = entrada.nextLine();
        System.out.print("Escreva sua altura(m): ");
        p.altura = entrada.nextDouble();
        System.out.print("Escreva seu peso(kg): ");
        p.peso = entrada.nextDouble();

       Double imc = p.calcularImc(p.peso,p.altura);
       System.out.println("Sua situação é: " + p.avaliaIMC(imc));
       entrada.close(); 

    }
    
}
