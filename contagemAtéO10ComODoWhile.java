/*O usuário conta até um número final, mas a cada 10 números deve
digitar um código para evitar armadilhas. O jogo continua até o 
número final ou erro no código.
*/

package aula_12;

import java.util.Scanner;

public class contagemAtéO10ComODoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo, Super-Herói! Você precisa salvar a cidade.");
        System.out.print("Digite o número até o qual você quer contar: ");
        int numeroFinal = scanner.nextInt();
        int contador = 1;

        do {
            System.out.println("Contando: " + contador);

            if (contador % 10 == 0) {
                System.out.print("ARMADILHA! Digite o código da armadilha para continuar: ");
                String codigo = scanner.next();
                if (!codigo.equals("2307")) {
                    System.out.println("Código errado! Você falhou!");
                    break;
                }
            }

            contador++;
        } while (contador <= numeroFinal);

        if (contador > numeroFinal) {
            System.out.println("Você salvou a cidade!");
        }

        scanner.close();
    }
}