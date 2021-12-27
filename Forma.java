//clase abstracta
public abstract class  Forma{

  protected int posicionX;
  protected int posicionY;

  protected void mover(int nuevox,int nuevoy){
    posicionX=nuevox;
    posicionY=nuevoy;

  }

  protected void dondeEstoy(){

    String lugar ="Estoy en X: "+posicionX+"poscion en y "+posicionY;



    System.out.println(lugar);
  }
  protected abstract void redimensionar();
  protected abstract void dibujar();

}
