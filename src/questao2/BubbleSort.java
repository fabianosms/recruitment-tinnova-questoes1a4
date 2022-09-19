package questao2;

public class BubbleSort {

    public static void main(String[] args) {

//      Variáveis

        int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
        int tamanho = v.length;

        int posicaoTemporaria;


//      Vetor antes

        System.out.print("v = {");

        for (int i = 0; i < tamanho - 1; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println(v[tamanho - 1] + "}");


//      Ordenação

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    posicaoTemporaria = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = posicaoTemporaria;
                }
            }
        }


//      Vetor depois

        System.out.print("v = {");

        for (int i = 0; i < tamanho - 1; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println(v[tamanho - 1] + "}");
    }
}