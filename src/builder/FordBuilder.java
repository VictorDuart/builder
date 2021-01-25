package builder;


public class FordBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.preco = 2000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.descMotor = "1.0 Flex";
    }

    @Override
    public void buildAnoDeFabricacao() {
       carro.anoDeFabricacao = 2012;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "KA";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Ford";
    }
    
}