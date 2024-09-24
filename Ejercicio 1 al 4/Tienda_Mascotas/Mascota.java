package Tienda_Mascotas;

public class Mascota {
    String nombre;
    int edad;
    String color;
    double peso;
    public Mascota(String nombre, int edad, String color,double peso){
        this.nombre=nombre;
        this.color=color;
        this.peso=peso;
    }
    public void imprimir(){
        System.out.println("Su nombre es :"+nombre);
        System.out.println("Su edad es :"+edad);
        System.out.println("Su color :"+color);
        System.out.println("Su peso es :"+peso);
    }
}
