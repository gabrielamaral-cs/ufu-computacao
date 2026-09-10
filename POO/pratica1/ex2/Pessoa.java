package POO.pratica1.ex2;

public class Pessoa {

    String nome;
    double peso;
    double altura;

    public double calcularImc(double peso, double altura){
        return (peso)/(altura * altura);
    }

    public String avaliaIMC(double imc){
        if(imc <18.5){
            return "Abaixo do peso";
        } 
        if (imc>=18.5 && imc<=24.9){
            return "Peso normal";
        }
        if (imc>24.9){
            return "Acima do peso";
        }
        else{
            return "Inválido";
        }
    }
}
