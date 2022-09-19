package questao1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Scanner;

public class EleitoresQuaisquer {

    public static void main(String[] args) {

//      Variáveis

        BigInteger zero = BigInteger.ZERO;
        BigInteger totalEleitores;
        BigInteger votosValidos;
        BigInteger votosBranco;
        BigInteger votosNulo;

        Scanner scanner = new Scanner(System.in);


//      Input e validações

        try {
            System.out.println("Digite o total de eleitores");
            totalEleitores = scanner.nextBigInteger();
            System.out.println("Digite o total de votos válidos");
            votosValidos = scanner.nextBigInteger();
            System.out.println("Digite o total de votos em branco");
            votosBranco = scanner.nextBigInteger();
            System.out.println("Digite o total de votos nulos");
            votosNulo = scanner.nextBigInteger();
        } catch (Exception e) {
            System.out.println("O valor deve ser um número inteiro.");
            return;
        }

        if (totalEleitores.equals(zero) && votosValidos.equals(zero) && votosBranco.equals(zero) && votosNulo.equals(zero)) {
            System.out.println("O percentual de votos válidos é zero");
            System.out.println("O percentual de votos em branco é zero");
            System.out.println("O percentual de votos nulos é zero");
            System.out.println("O percentual dos eleitores que não votaram é zero");
            return;
        }

        if (votosValidos.compareTo(zero) < 0 || votosBranco.compareTo(zero) < 0 || votosNulo.compareTo(zero) < 0) {
            System.out.println("Os valores digitados devem ser maiores ou iguais a zero.");
            return;
        }

        if (totalEleitores.compareTo(votosValidos.add(votosBranco).add(votosNulo)) < 0) {
            System.out.println("O total de eleitores informado é menor do que o total de votos informado.");
            return;
        }


//      Parseamento

        BigDecimal totalEleitoresCalculo = new BigDecimal(totalEleitores);
        BigDecimal votosValidosCalculo = new BigDecimal(votosValidos);
        BigDecimal votosBrancoCalculo = new BigDecimal(votosBranco);
        BigDecimal votosNuloCalculo = new BigDecimal(votosNulo);


//      Cálculos

        BigDecimal naoVotaramCalculo = totalEleitoresCalculo.subtract(votosValidosCalculo.add(votosBrancoCalculo).add(votosNuloCalculo));

        BigDecimal percentualVotosValidos = votosValidosCalculo.divide(totalEleitoresCalculo);
        BigDecimal percentualVotosBranco = votosBrancoCalculo.divide(totalEleitoresCalculo);
        BigDecimal percentualVotosNulo = votosNuloCalculo.divide(totalEleitoresCalculo);
        BigDecimal percentualNaoVotaram = naoVotaramCalculo.divide(totalEleitoresCalculo);


//      Impressão

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        numberFormat.setMinimumFractionDigits(1);

        System.out.println("O percentual de votos válidos é " + numberFormat.format(percentualVotosValidos));
        System.out.println("O percentual de votos em branco é " + numberFormat.format(percentualVotosBranco));
        System.out.println("O percentual de votos nulos é " + numberFormat.format(percentualVotosNulo));
        System.out.println("O percentual dos eleitores que não votaram é " + numberFormat.format(percentualNaoVotaram));
    }
}