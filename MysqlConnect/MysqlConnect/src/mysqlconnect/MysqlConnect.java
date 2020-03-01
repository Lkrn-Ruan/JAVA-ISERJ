package mysqlconnect;
import java.sql.*;

public class MysqlConnect {
    public static void main(String[] args) {
        System.out.println("MySQL Connect Example.");
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName= "javadb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try{
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url+dbName, userName, password);
            try{
                Statement st = con.createStatement();
                String table = "CREATE TABLE Employee(Emp_code integer, Emp_name varchar(10))";
                st.executeUpdate(table);
                System.out.println("Criação da Tabela com sucesso");
            }catch(SQLException s){
                System.out.println("Tabela já existente");
            }
            con.close();
        }
            catch (Exception e){
            e.printStackTrace();
               
            }
        }
    }
    

