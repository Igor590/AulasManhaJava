package exercicios;

public class Pessoa {
    public String nome;
    private int idade;
    public char sexo;
    public String endereco;
    private double salario;


    //Construtor
    public Pessoa(String nome, char sexo, String endereco){
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    /*
    *Métodos de leitura e escrita de dados
    * getIdade/setIdade = idade
    *
    * getSalario/setSalario = salario
     */
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;

    }
}