package deletetable;
import java.sql.*;

public class DeleteTable{
	public static void main(String[] args) {
		System.out.println("Processando.....");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "javadb";
		String driverName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";
		try{
			Class.forName(driverName).newInstance();
			con = DriverManager.getConnection(url+dbName, userName, password);
			try{
				Statement st = con.createStatement();
				st.executeUpdate("DROP TABLE Employee");
				System.out.println("Tabela deletada com sucesso!!!!!");
			}
			catch(SQLException s){
				System.out.println("Essa tabela não EXISTE!!!!!");
			}
			con.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
