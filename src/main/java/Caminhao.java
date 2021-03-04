public class Caminhao extends Transporte{
    public Caminhao(Carga carga) {
        super(carga);
    }

    @Override
    public double calculaFrete(int distancia) {
        double frete =  ((this.getCarga().getPeso() * 0.02) + (this.getCarga().getValor() * 0.03) + distancia * 2);
        if (this.getCarga().getValor() > 40000) {
            frete = frete - frete*0.25;
        }
        return frete;
    }
}
