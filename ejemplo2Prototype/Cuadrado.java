public class Cuadrado implements Figura{
  private  String nombre;
  private int posicionx;
  private int posiciony;

  public Cuadrado(){}

  @Override
  public void setNombre(String n){
    this.nombre=n;

  }
  @Override
  public String getNombre(){
    return nombre;
  }
  @Override
  public void mover(int x,int y){
    this.posiciony=y;
    this.posicionx=x;
  }
  @Override
  public void getposicion(){

    System.out.println("  Circulo posicion en x: "+this.posicionx+" Circulo posicion en y "+this.posiciony);
  }
  @Override
  public Figura clonar(){
    Figura figura=new Cuadrado();
    figura.setNombre(this.nombre);
    figura.mover(this.posicionx,this.posiciony);
    return figura;

  }
}
