package Clases;

public class Carro extends Vehiculo {

    public Carro(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoDeAlquiler(int dias) {
        double costoBase = tarifaBase*dias;
        double costoExtra = dias * 10;

        return costoBase + costoExtra;
    }
}
