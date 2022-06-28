package entitie;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        show.println("Olá! Qual o seu nome?");
        String nome = scan.nextLine();
        show.printf("Prazer em conhece-lo %s !\n", nome);
        show.println(nome + ", você quer jogar comigo ?");
        show.println("\nInforme o número da sua opção. ");
        show.println("1 -> Sim.");
        show.println("2 -> Não.");
        opcao = scan.nextInt();

        if (opcao == 2) {

            show.println("Que pena! Mas tudo bem, fica para a próxima.");

        } else if (opcao == 1) {

            show.println("Ok! O jogo é assim...\n");
            show.println("Eu vou escolher um número de 0 a 10...\n");
            show.println("Mas não vou falar para você qual foi.\n");
            show.println("Se você consegui adivinhar qual foi...\n");
            show.println("Você será o vencedor!!\n");

            escolha_computador = gerador.nextInt(11);

            show.printf("Ok, %s. Eu já escolhi!", nome);
            show.println("Agora tente adivinhar!");

            do {
                escolha_usuario = scan.nextInt();
                if (escolha_usuario != escolha_computador) {
                    show.println("Resposta errada!");
                } else {
                    show.println("Parabéns! Você acertou!");
                }

            } while (escolha_computador != escolha_usuario);

        }
        scan.close();

    }

}
