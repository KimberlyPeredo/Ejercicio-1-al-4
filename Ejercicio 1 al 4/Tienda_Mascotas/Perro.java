package Tienda_Mascotas;

public class Perro extends Mascota{
    enum perroPeq{CANICHE,YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA}
    Perro.perroPeq perro_pequeño;
    enum perroMed{COLLIE, DÁLMATA, BULLDOG, GALGO, SABUESO}
    Perro.perroMed perro_mediano;
    enum perroGran{PASTOR_ALEMÁN, DOBERMAN, ROTWEILLER}
    Perro.perroGran perro_grande;
    public Perro(String nombre, int edad, String color,double peso, Perro.perroPeq perro_pequeño, Perro.perroMed perro_mediano,Perro.perroGran perro_grande){
       super(nombre, edad, color, peso);
       this.perro_pequeño=perro_pequeño;
       this.perro_mediano=perro_mediano;
       this.perro_grande=perro_grande;
    }
}
