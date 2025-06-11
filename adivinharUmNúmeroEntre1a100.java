/*O programa gera um número aleatório entre 1 e 100. O usuário
tenta adivinhar o número e o programa informa se a tentativa é 
maior ou menor até que o usuário acerte. O total de tentativas é 
mostrado ao final.
*/
package aula_12;
import java.util.Random;
import java.util.Scanner;

public class adivinharUmNúmeroEntre1a100 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Jogo do Número Secreto:");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = ler.nextInt();
            tentativas++;

            if (palpite < 1 || palpite > 100) {
                System.out.println("Digite um número entre 1 e 100");
            } else if (palpite < num) {
                System.out.println("Errado! O número secreto é maior que " + palpite + ".");
            } else if (palpite > num) {
                System.out.println("Errado! O número secreto é menor que " + palpite + ".");
            } else {
                System.out.println("Você acertou! O número era " + num);
                System.out.println("Seu número de tentativas foi: " + tentativas);
            }

        } while (palpite != num);

        ler.close();
    }
}
