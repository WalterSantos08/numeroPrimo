/* Crie um programa que receba um número e verifique se ele é primo. */

import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) { 
                if (numero % i == 0) { 
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        entrada.close();
    }
}
