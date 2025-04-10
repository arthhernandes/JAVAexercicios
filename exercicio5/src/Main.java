public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cadastro de Carro para o Evento ===");

        String marca = inputHelper.lerTexto("Marca: ");
        String modelo = inputHelper.lerTexto("Modelo: ");
        int ano = Integer.parseInt(inputHelper.lerTexto("Ano: "));
        String placa = inputHelper.lerTexto("Placa: ");

        Carro carroUsuario = new Carro(marca, modelo, ano, placa);

        carroUsuario.exibirInformacoes();

        int acelerar = inputHelper.lerInteito("Quanto deseja acelerar (km/h)? ");
        carroUsuario.acelerar(acelerar);

        int frear = inputHelper.lerInteito("Quanto deseja frear (km/h)? ");
        carroUsuario.frear(frear);

        carroUsuario.exibirInformacoes();
    }
}
