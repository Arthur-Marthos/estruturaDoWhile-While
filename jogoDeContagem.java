/*
O jogador coleta estrelas no espaço. A cada 10 estrelas, meteoros 
aparecem e o jogador deve desviar digitando "esquerda" ou "direita".
O jogo conta as estrelas e exige o comando correto.
*/
package aula_12;

import java.util.Scanner;

public class jogoDeContagem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem-vindo à Corrida Espacial");
        System.out.print("Quantas estrelas você pretende coletar? ");
        int totalEstrelas = ler.nextInt();

        int estrelasColetadas = 0;

        while (estrelasColetadas < totalEstrelas) {
            estrelasColetadas++;
            System.out.println("Estrela coletada! Total: " + estrelasColetadas);

            if (estrelasColetadas % 10 == 0) {
                System.out.println("Cuidado! Vem um meteoro! Tente desviar digitando 'esquerda' ou 'direita'!");

                String comando;
                do {
                    System.out.print("Desvie: ");
                    comando = ler.next();
                    if (!comando.equals("esquerda") && !comando.equals("direita")) {
                        System.out.println("Comando inválido! Tente 'esquerda' ou 'direita'.");
                    }
                } while (!comando.equals("esquerda") && !comando.equals("direita"));

                System.out.println("Desvio bem-sucedido.");
            }
        }

        System.out.println("A corrida terminou! Você coletou ao todo " + estrelasColetadas + " estrelas!");
        ler.close();
    }
}
