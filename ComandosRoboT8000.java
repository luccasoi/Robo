import java.util.Scanner;

public class ComandosRoboT8000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao,gg;
        int TENTAIVAS_MAXIMAS = 7;
        double valor1, valor2, posicao;

        System.out.println("1 para frente");
        System.out.println("2 para direita");
        System.out.println("3 para esquerda");
        System.out.println("4 para tras");

        for (gg = TENTAIVAS_MAXIMAS; gg >= 0; gg--){
            System.out.println("Direção que deseja andar");
            opcao = sc.nextInt();
            if ((opcao < 1) || (opcao>4)){
                System.out.println("❌Valor invalido❌");
                break;
            }

            System.out.println("Quantos passos que deseja andar");
            valor2 = sc.nextDouble();

            if(valor2 < 0 || valor2 > 10){
                System.out.println("❌Valor invalido❌");
                break;
            }
            if (opcao == 1) {
                posicao = valor2;
                System.out.println("Andou para frente na quantidade " + posicao + " passos");
            }
            if (opcao == 2) {
                posicao = valor2;
                System.out.println("Andou para direita na quantidade " + posicao + " passos");
            }
            if (opcao == 3) {
                posicao = valor2;
                System.out.println("Andou para esquerda na quantidade " + posicao + " passos");
            }
            if (opcao == 4) {
                posicao = valor2;
                System.out.println("Andou para tras na quantiade " + posicao + " passos");
            }
            System.out.println("✅Comando Valido✅");

            if(gg == 0){
                System.out.println("⚠️Tentativas Maximas Concluidas⚠️");
            }
        }
    }
}

// javac <arquivo.java>
// java arquivo