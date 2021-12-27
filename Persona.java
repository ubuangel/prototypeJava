public class Persona {

    private String nombre;
    private int edad;
    private char sexo;

//Metodo constructor por defecto (default)
    public Persona(){
    }
//Metodo contructor parametrizado
    public Persona(String nombre, int edad, char sexo){
      //Uso de la palabra clave THIS en una clase JAVA
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void printMessage(){
        System.out.println("Soy una persona.");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String returnDatosPersona(String nombre, int edad, char sexo){
   String cadena = "";

   cadena = "Nombre = " + nombre;
   cadena += ", Edad = " + edad;
   cadena += ", Sexo = " + sexo;

   return cadena;
        }


        public void printDatos(){
   String datos = this.returnDatosPersona("ANTONIO", 19, 'M');
   System.out.println("Datos de la persona: " + datos);
      }

      public static void main(String[] args) {
    Persona hugo = new Persona();
    Persona pedro = new Persona("Pedro", 18, 'M');

    pedro.printDatos();
      }
}
