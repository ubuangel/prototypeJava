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
