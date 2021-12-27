import java.util.Scanner;

public class Contabilidad{

  public static void main(String [] args){

    Scanner sc=new Scanner (System.in);

    Fabrica mifabrica;
    Conexion miconexion;
    System.out.println("digite la base de datos: ");

    String tipo=sc.nextLine();

    mifabrica=new Fabrica(tipo);

    miconexion=mifabrica.conexionCrea();

    String salida="Esta conextado con"+miconexion.descripcion();

    System.out.println(salida);
  }


}
