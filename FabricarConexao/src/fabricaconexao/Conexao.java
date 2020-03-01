package fabricaconexao;

import java.sql.*;


/**
 * Classe que permite conectar con a base de dados
 
 *
 */
public class Conexao {
   static String bd = "projetojava";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/"+bd;

   Connection conn = null;

   /** Construtor de DbConnection */
   public Conexao() {
      try{
         //obtemos o driver de mysql
         
         //obtemos a conexão
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
           // System.out.println("Conexão a base de dados "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
    
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar a conexão*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}