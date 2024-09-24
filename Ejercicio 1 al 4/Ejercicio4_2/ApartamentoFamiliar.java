package Ejercicio4_2;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministración;
    public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int valorAdministración) {
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
        this.valorAdministración = valorAdministración;
    }
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $ " +valorAdministración);
        System.out.println();
    }


}
