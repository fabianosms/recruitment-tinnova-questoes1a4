package questao4;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

//      Variáveis

        BigInteger zero = BigInteger.ZERO;
        BigInteger um = BigInteger.ONE;
        BigInteger tres = new BigInteger("3");
        BigInteger cinco = new BigInteger("5");
        BigInteger resposta = BigInteger.ZERO;
        BigInteger valorDigitado;


//      Input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro, maior ou igual a zero: ");


//      Validações

        try {
            valorDigitado = scanner.nextBigInteger();
        } catch (Exception e) {
            System.out.println("O valor deve ser um número inteiro");
            return;
        }

        if (valorDigitado.compareTo(zero) < 0) {
            System.out.println("O valor deve ser maior ou igual a zero");
            return;
        }


//      Cálculo e impressão da resposta

        try {
            for (BigInteger i = zero; i.compareTo(valorDigitado) < 0; i = i.add(um)) {
                if (i.mod(tres).equals(zero) || i.mod(cinco).equals(zero)) {
                    resposta = resposta.add(i);
                }
            }
            System.out.println("A soma dos múltiplos de 3 e 5 entre 0 e " + valorDigitado + " é " + resposta);
        } catch (Exception e) {
            System.out.println("O valor digitado é grande demais. Digite um número menor.");
        }
    }
}