package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection(); //Iniciando conexão com o banco de dados
			
			st = conn.createStatement(); // Criando um Statement que e alguma informação que o banco de dados vai receber
			
			rs = st.executeQuery("select * from department"); //Vai executar uma Query que foi passada e o ResultSet vai receber elas
			
			while (rs.next()) { //.next() retorna false quando chegar ao final
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); // .get -> seleciona o tipo do campo e depois o nome dele
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			DB.closeStatement(st); //Criado um metdo na classe DB para não ter que criar mais catch
			DB.closeResultSet(rs);
			DB.closeConnection();
			
		}
	}
}
