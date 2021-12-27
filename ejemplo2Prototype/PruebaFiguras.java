import java.util.Scanner;
public class PruebaFiguras{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
   int posx,posy,opcion;

    Circulo circulo=new Circulo();
    Cuadrado cuadrado=new Cuadrado();
    Figura figura;


    circulo.setNombre("Mi circulo");
    circulo.mover(12,34);

    cuadrado.setNombre("Mi cuadradito");
    cuadrado.mover(200,200);

  System.out.println("estas son las figuras originales");
  System.out.println("mi circulo "+circulo.getNombre());
  System.out.println("mi cuadrado "+cuadrado.getNombre());

  System.out.println("estas son las posiciones  originales: ");
  circulo.getposicion();
  cuadrado.getposicion();

  System.out.println("digite la opcion: ... ");
  System.out.println("si es 1 sera un circulo");
  System.out.println("si es 2 sera un cuadrado");

  opcion=sc.nextInt();
  if (opcion==1) {
    figura=circulo.clonar();
  }else{

    figura=cuadrado.clonar();
  }

figura.setNombre(figura.getNombre()+"clonado");
System.out.println("digite la nuevaposicon de x:");
posx=sc.nextInt();
System.out.println("digite la nuevaposicon de y:");
posy=sc.nextInt();
figura.mover(posx,posy);

System.out.println("esta es la figura clonada :");
System.out.println(figura.getNombre());
System.out.println("mostrando posicion :");

figura.getposicion();

  }
}
