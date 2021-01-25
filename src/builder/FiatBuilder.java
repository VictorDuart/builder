package builder;


public class FiatBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.preco = 2500.00;
    }

    @Override
    public void buildDscMotor() {
        carro.descMotor = "1.0 Fire Flex";
    }

    @Override
    public void buildAnoDeFabricacao() {
       carro.anoDeFabricacao = 2011;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Palio";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Fiat";
    }
    
}