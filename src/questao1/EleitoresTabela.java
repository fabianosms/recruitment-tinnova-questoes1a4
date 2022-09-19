package questao1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class EleitoresTabela {

    public static void main(String[] args) {

//      Variáveis

        BigInteger totalEleitores = new BigInteger("1000");
        BigInteger votosValidos = new BigInteger("800");
        BigInteger votosBranco = new BigInteger("150");
        BigInteger votosNulo = new BigInteger("50");


//      Parseamento

        BigDecimal totalEleitoresCalculo = new BigDecimal(totalEleitores);
        BigDecimal votosValidosCalculo = new BigDecimal(votosValidos);
        BigDecimal votosBrancoCalculo = new BigDecimal(votosBranco);
        BigDecimal votosNuloCalculo = new BigDecimal(votosNulo);


//      Cálculos

        BigDecimal percentualVotosValidos = votosValidosCalculo.divide(totalEleitoresCalculo);
        BigDecimal percentualVotosBranco = votosBrancoCalculo.divide(totalEleitoresCalculo);
        BigDecimal percentualVotosNulo = votosNuloCalculo.divide(totalEleitoresCalculo);


//      Impressão

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        numberFormat.setMinimumFractionDigits(1);

        System.out.println("O percentual de votos válidos é " + numberFormat.format(percentualVotosValidos));
        System.out.println("O percentual de votos em branco é " + numberFormat.format(percentualVotosBranco));
        System.out.println("O percentual de votos nulos é " + numberFormat.format(percentualVotosNulo));
    }
}