package questao3;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

//      Variáveis

        BigInteger zero = BigInteger.ZERO;
        BigInteger um = BigInteger.ONE;
        BigInteger numero;


//      Input e validações

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro, maior ou igual a zero: ");


        try {
            numero = scanner.nextBigInteger();
        } catch (Exception e) {
            System.out.println("O valor deve ser um número inteiro.");
            return;
        }

        BigInteger numeroDigitado = numero;

        if (numero.compareTo(zero) < 0) {
            System.out.println("O número deve ser maior ou igual a zero.");
            return;
        }


//      Caso particular

        if (numero.equals(zero)) {
            System.out.println("0! = 1");
            return;
        }


//      Cálculo e impressões

        try {
            for (BigInteger i = numero.subtract(um); i.compareTo(um) > 0; i = i.subtract(um)) {
                numero = numero.multiply(i);
            }
            System.out.println(numeroDigitado + "! = " + numero);

        } catch (Exception e) {
            System.out.println("O valor digitado é grande demais. Digite um número menor.");
        }
    }
}