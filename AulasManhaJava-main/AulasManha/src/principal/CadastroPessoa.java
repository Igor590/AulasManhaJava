package principal;

import exercicios.Pessoa;

import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pessoa homem = new Pessoa("Igor Miranda", 'M', "Rua Pangaré, 103");
        Pessoa mulher = new Pessoa("Helena Fiuza", 'F', "Acre, com dinossauros");

        System.out.print("Digite a idade:");
        int idade = input.nextInt();
        homem.setIdade(idade);
        System.out.print("Digite o salário: ");
        double salario = input.nextDouble();
        homem.setSalario(salario);

        System.out.print("Meu nome é " +homem.nome + " Meu salário é " +homem.getSalario());
        System.out.printf("Meu sexo é %c e minha idade %d meu salario com decimais %.2f %s", homem.sexo, homem.getIdade(), homem.getSalario(), "\n");

        mulher.setIdade(18);
        mulher.setSalario(-500.00);
    }
}
