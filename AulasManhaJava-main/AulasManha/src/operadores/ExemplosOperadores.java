package operadores;

public class ExemplosOperadores {
    public class void main(String[]){
        int a = 12, b = 4;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        System.out.println("OPERADORES RELACIONAIS");
        System.out.println("Maior" + (a > b));
        System.out.println("Menor igual" + (a <= b));
        System.out.println("Igual" + (a == b));


        int valor = 21;
        System.out.println("OPERADORES UNÁRIOS");
        System.out.println("Pre Fixado: " + ++valor);
        System.out.println("Pos Fixado: " + valor++);
        System.out.println("Valor Final: " + valor);

        System.out.println("OPERADORES DE ATRIBUIÇÃO");
        System.out.println("expressao += : " + (valor+=20));

        System.out.println("OPERADOR TERNÁRIO");
        double media = 7.00;
        String mensagem = (media >= 7.00) ? "APROVADO" : "REPROVADO";
        System.out.println("Sua média é: " + media + " e sua situacao: " + mensagem);
    }
}
