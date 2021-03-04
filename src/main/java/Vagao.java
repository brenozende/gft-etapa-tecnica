public class Vagao extends Transporte{

    public Vagao(Carga carga) {
        super(carga);
    }

    @Override
    public double calculaFrete(int distancia) {
        //Frete = 7% do peso da carga + 1% do valor da carga + 0,50R$ por km
        double frete = ((this.getCarga().getPeso() * 0.07) + (this.getCarga().getValor() * 0.01) + distancia * 0.50);
        if (this.getCarga().getPeso() < 15000) {
            frete = frete + 5000;
        }
        return frete;
    }
}
