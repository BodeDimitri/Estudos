package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import enteties.Comment;
import enteties.Post;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Wow");
		Comment c2 = new Comment("UwU");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:43"), 
				"Viajando para um lugar",
				"Estou visitando um lugar",
				12);
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1.toString());
	}

}
