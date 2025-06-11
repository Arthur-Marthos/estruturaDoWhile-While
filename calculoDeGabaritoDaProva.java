/*
O programa compara as respostas de alunos com um gabarito fixo,
calcula a nota e repete o processo para vários alunos. Ao final,
exibe o total de participantes e a média das notas.
 */
package aula_12;

import java.util.Scanner;

public class calculoDeGabaritoDaProva {
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	String[] gabarito = { "A", "B", "C", "D", "E", "E", "D", "C", "B", "A" };
	int totalAlunos = 0;
	int somaNotas = 0;
	String continuar;

	do
	{
		totalAlunos++;
		int acertos = 0;
		String[] respostasAluno = new String[10];

		System.out.println("Responda as 10 questões (A, B, C, D ou E):");

		for (int i = 0; i < 10; i++) {
			System.out.print("Questão " + (i + 1) + ": ");
			respostasAluno[i] = ler.next();

			if (respostasAluno[i].equalsIgnoreCase(gabarito[i])) {
				acertos++;
			}
		}

		System.out.println("Você acertou " + acertos + " questões.");
		somaNotas += acertos;

		System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
		continuar = ler.next();

	}while(continuar.equalsIgnoreCase("S"));

	double media = (double) somaNotas
			/ totalAlunos;System.out.println("\nTotal de alunos: "+totalAlunos);System.out.println("Média da turma: "+media);

	ler.close();
}
}