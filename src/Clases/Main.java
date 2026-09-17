package Clases;

public class Main {

    public static void main(String[] args) {
        Vehiculo car1= new Carro ("Toyota", "Fortuner", 8);
        Vehiculo mot1= new Moto ("Kawasaki", "Ninja H2R", 6);
        
        System.out.println("Costo de alquiler de la "+ car1.getMarca()+" "+ car1.getModelo()+ " es de= $"+ car1.calcularCostoDeAlquiler(5));
        System.out.println("Costo de alquier de la "+ mot1.getMarca()+ " "+ mot1.getModelo()+ " es de= $"+mot1.calcularCostoDeAlquiler(5));
    }
    
}
