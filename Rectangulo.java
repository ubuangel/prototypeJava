//import Forma;

public class Rectangulo extends Forma{
  public Rectangulo(){
    mover(5,8);
    dondeEstoy();

  }
  @Override
  public void dibujar(){

    System.out.println("estoy dibujando");
  }
  @Override
  public void redimensionar(){
    System.out.println("me estoy redimensionando");
  }

}
