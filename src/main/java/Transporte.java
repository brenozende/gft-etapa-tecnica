public abstract class Transporte {
    private Carga carga;
    public Transporte(Carga carga) {
        this.carga = carga;
    }
    public abstract double calculaFrete(int distancia);

    public Carga getCarga() {
        return carga;
    }
}
