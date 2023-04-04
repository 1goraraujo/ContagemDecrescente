import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        teclado
        Scanner teclado = new Scanner(System.in);

//        solicitaç�o ao usuario

        System.out.println("Digite um numero:\n");
        int numero = teclado.nextInt();

        System.out.println("Ordem decrescente:\n");

//        laço de repetiç�o

        for (int i = numero; i >= 0; i--) {
//            Cada vez que for diminuido 1 no valor de i, imprima i
            System.out.println(i);
        }

    }
}