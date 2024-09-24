package Ejercicio4_2;

public class InmuebleVivienda extends Inmueble{
    protected int númeroHabitaciones;
    protected int númeroBaños;
    public InmuebleVivienda(int identificadorInmobiliario, int área, String direccion, int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, direccion);
        this.númeroHabitaciones = númeroHabitaciones;
        this.númeroBaños = númeroBaños;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones = "+númeroHabitaciones);
        System.out.println("Número de baños = "+númeroBaños);
    }
}
