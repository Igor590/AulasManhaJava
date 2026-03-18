package condicionais;

import java.util.Scanner;

public class ExemplosIf {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double n1,n2,n3, media;
        String mensagem;

        System.out.println("insira 3 notas: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        media = (n1 + n2 + n3)/3;
        if (media >= 7) {
            mensagem = "APROVADO";
        }else if ((media >= 3)){
            mensagem = "PROVA FINAL";
        } else {
            mensagem = "REPROVADO";
        }
        System.out.printf("A sua média foi: %.2f, a sua situação é %s.", media, mensagem);
    }
}
