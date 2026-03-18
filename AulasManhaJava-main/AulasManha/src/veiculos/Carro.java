package veiculos;

import  java.lang.invoke.VarHandle;

public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public boolean existe;
    public double valor;
    public int velocidade = 0;
    public static String chassis;
    private String placa;
    private int codigoAcesso;
    protected String cor;
    public final double TAXA_IMPOSTO = 0.32;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;

    }

    public void setCodigoAcesso(int codigoAcesso){
        this.codigoAcesso = codigoAcesso;
    }

    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }

    public void freiar(int valor){
        velocidade = velocidade - valor;
    }

    public double calcularIpva(){
        double valorPagar;
        valorPagar = valor - (valor * TAXA_IMPOSTO);
        return valorPagar;
    }
}
