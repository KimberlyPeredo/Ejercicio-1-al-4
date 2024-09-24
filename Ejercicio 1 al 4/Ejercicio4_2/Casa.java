package Ejercicio4_2;

public class Casa extends InmuebleVivienda{
    protected int númeroPisos;
    public Casa(int identificadorInmobiliario,int área, String direccion,int númeroHabitaciones, int númeroBaños, int númeroPisos){
        super(identificadorInmobiliario,área,direccion,númeroHabitaciones,númeroBaños);
        this.númeroPisos=númeroPisos;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Número de pisos= "+númeroPisos);
    }
}
