package Ejercicio4_2;

public class ApartaEstudio extends Apartamento {
    protected static double valorArea=1500000;
    public ApartaEstudio(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, dirección, 1, 1);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
