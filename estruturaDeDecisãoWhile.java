/*O programa permite que o usuário tome decisões em sequência
(frente, esquerda ou direita), acumulando pontos ou encerrando 
o jogo em caso de derrota. Utiliza laço while para repetir até 
o fim do jogo.
 */
package aula_12;
import java.util.Random;
import java.util.Scanner;

public class estruturaDeDecisãoWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int pontos = 0;
        final int pontosParaVencer = 50;

        System.out.println("CAVERNA DOS DRAGÕES");
        System.out.println("Você entrou em uma caverna misteriosa para buscar os tesouros...");
        System.out.println("Mas cuidado! Há dragões por todos os lados.");

        while (pontos < pontosParaVencer) {
            System.out.print("Escolha um caminho (frente / esquerda / direita): ");
            String direcao = ler.next();

            int evento = random.nextInt(2); // 0 ou 1

            if (evento == 0) {
                System.out.println("Um dragão apareceu! Você foi derrotado...");
                break;
            } else {
                pontos += 10;
                System.out.println("Você encontrou um tesouro, parabéns!!! Seus pontos são: " + pontos);
            }
        }

        if (pontos >= pontosParaVencer) {
            System.out.println("Você escapou da caverna com " + pontos + " pontos em tesouros");
        } else {
            System.out.println("Fim de jogo. Boa sorte na sua próxima aventura!");
        }

        ler.close();
    }
}

