public class Persona {
    private String nombre;
    private int edad;
  

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void showInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Cristina", 19);
        persona.showInfo();
    }
}
