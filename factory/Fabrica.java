//es creaecion de
//las interfaces es una coleccoin de metodos abstractos y propiedades constantes
//y todas la clases que implementen ese interfaz deben sobreesecribir cada uno de sus  metodos

public class Fabrica{
  //nombre del tipo de conexion
  protected String tipo;
  public Fabrica(String t){
    tipo=t;
  }
//metodo que retorna el objet o
//conexion especifio
  public Conexion conexionCrea(){
      if (tipo.equalsIgnoreCase("Oracle")) {
        return new OracleConexion();
      }else if (tipo.equalsIgnoreCase("SQLServer")) {
        return new SqlserverConexion();
      }else if (tipo.equalsIgnoreCase("MySql")) {
          return new MysqlConexion();
      }else{
          return new PostgresConexion();
      }


  }


}
//Factory metodo: consiste en definir una interfaz para crear  objetos de tipo  genericos permitiendo a las subclases decidir que tipo de objetos se va a crear 
//se encarga de crear los objetos de conexion dependiendo el que escoga el cliente
// el onjeto ser acreado en timepo de ejecucion ,por lo uqe ya no se teine en problema de terner una version de l programa por cada version de base dedato existente enele mercado
//si mas adelante uncliente requiere una conexion que no setuviera lo unico que se agrega es el tipo de conexion ha esta fabrica y todos los modulos del programa obtendran el tipo de conexion de este objeto
