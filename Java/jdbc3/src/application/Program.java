package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO seller" +
					"(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(? ,? ,? ,? , ?)",//Placeholder, esse lugar vai ser preenchido depois
					Statement.RETURN_GENERATED_KEYS); // Usado para retornar as chaves alteradas
					
			st.setString(1, "Carl"); //st -> colocar o tipo e depois o caractere em questão que vai preencher
			st.setString(2, "email@com.com.br");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1889").getTime())); //Quando for utilizar SQL e fir se referir a data não se esquecer de importar o certo, não se esquece do .getTime no final
			st.setDouble(4, 3000.0);
			st.setInt(5, 3);
			
			int rowsAffected = st.executeUpdate(); //Usado para atualizar o banco de dados, retorna a quantidade de rows alteradas
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys(); // Tem de usar o Result set
				while(rs.next()) {
					int id = rs.getInt(1); //Retorna o ID
					System.out.println(id);
				}
			} else {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection(); //Sempre deixa para fechar a conexão por ultimo
		}

	}
}
