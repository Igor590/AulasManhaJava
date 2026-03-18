package principal;

import veiculos.Carro;

public class Main {
    public static void main(String[] args){
      Carro carroPopular = new Carro("Volkswagem", "Fusca", 1960);
      Carro carroLuxo = new Carro("Ferrari", "XR2027", 2026);

      carroPopular.marca = "Volkswagem";
      carroPopular.modelo = "Fusca";
      carroPopular.ano = 1960;
      carroPopular.existe = true;
      carroPopular.valor = 1000.00;
      carroPopular.acelerar(2);
      carroPopular.freiar(1);
      Carro.chassis = "SDFSDFSDFSDF";
      carroPopular.setPlaca("KIS-4780");
      carroPopular.setCodigoAcesso(123123);

      carroLuxo.marca = "Ferrari";
      carroLuxo.modelo = "XR2027";
      carroLuxo.ano = 2026;
      carroLuxo.existe = false;
      carroLuxo.valor = 850000.00;
      carroLuxo.acelerar(10);
      carroLuxo.freiar(5);
      double ipva = carroLuxo.calcularIpva();
      Carro.chassis = "DFDFDFDFDDF";
    }
}

