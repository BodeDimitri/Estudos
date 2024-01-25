package enteties;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Isso faz com que apenas uma seja criada e não recriada varias vezes
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>(); //Em lista não colocar setters, adicionar um metodo com .add e .remove

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComent(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComent(Comment comment) {
		this.comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); //Usado para criar o string de maneira mais facil
		sb.append(title + "\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: " + "\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString(); //Finalmente depois de escrito aqui ele manda sb para String e da return
	}
	
}
