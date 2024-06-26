import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<Jogador>();

        String resposta;

        do {
            System.out.println(">> Armazenando novo jogador");

            System.out.print("Digite o nome do jogador: ");
            String nome = leitor.nextLine();

            System.out.print("Digite a pontuação do jogador: ");
            float pontuacao = leitor.nextFloat();

            System.out.print("Digite o nivel do jogador: ");
            int nivel = leitor.nextInt();

            Jogador novoJogador = new Jogador(nome, pontuacao, nivel);

            jogadores.add(novoJogador);

            leitor.nextLine();
            System.out.print("Deseja armazenar um novo jogador? (s/n): ");
            resposta = leitor.nextLine();
        } while (!resposta.equals("n") && !resposta.equals("N"));

        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1. Aumentar pontuação do jogador");
            System.out.println("2. Aumentar nivel do jogador");
            System.out.println("3. Exibir informação do jogador");
            System.out.println("4. Sair");
            System.out.println("################################");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Deseja aumentar a pontuação de qual jogador? ");
                    int index1 = leitor.nextInt();

                    if (index1 >= 0 && index1 < jogadores.size()) {
                        jogadores.get(index1).aumentarPontuacao();
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }

                break;
                case 2:
                    System.out.print("Deseja aumentar o nivel de qual jogador? ");
                    int index2 = leitor.nextInt();

                    if (index2 >= 0 && index2 < jogadores.size()) {
                        jogadores.get(index2).subirNivel();
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }

                break;
                case 3:
                    System.out.print("Digite o índice do jogador: ");
                    int index3 = leitor.nextInt();

                    if (index3 >= 0 && index3 < jogadores.size()) {
                        jogadores.get(index3).exibirInfomacao();
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                break;
                case 4:
                    System.out.println("Saindo...");
                break;
                default:
                    System.out.println("Opção inválida.");
            } 

        } while (opcao != 4);
    }
}
