public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private  int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int acelera){
        if(acelera > 0){
            velocidadeAtual += acelera;
            System.out.println("Carro acelerou. Velocidade atual: " + velocidadeAtual + "km/h" );
        }else {
            System.out.println("Valor inválido.");
        }
    }

    public void frear(int freio){
        if(freio > 0){
            velocidadeAtual -=freio;
            if(velocidadeAtual < 0){
                velocidadeAtual = 0;
            }
            System.out.println("Carro freou. Velocidade atual: " + velocidadeAtual + "km/h");
        }else {
            System.out.println("Valor inválido");
        }
    }

    public void exibirInformacoes(){
        System.out.println("----- Informações do Carro -----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("--------------------------------");
    }
}
