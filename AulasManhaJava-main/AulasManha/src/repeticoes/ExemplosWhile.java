package repeticoes;

import java.util.Scanner;

public class ExemplosWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar = "sim";
        int op;

        while (continuar.equals("sim")) {
            System.out.println("Menu de opções");
            System.out.println("1. Maior/Menor");
            System.out.println("2. Buscar Valor");
            System.out.println("3. Par ou Ímpar");
            System.out.println("4. Sair");
            System.out.printf("Digite uma opção: ");

            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Opção 1 selecionada");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada");
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.printf("FIM DO PROGRAMA.");
            }
            System.out.print("Deseja continuar?: ");
            continuar = entrada.next();
        }
    }
}
