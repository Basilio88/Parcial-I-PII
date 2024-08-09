
package universidad;


public class Alumno {
   private static int contadorCarnet = 0;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;

    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = ++contadorCarnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Alumno:");
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println();
    }  

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
