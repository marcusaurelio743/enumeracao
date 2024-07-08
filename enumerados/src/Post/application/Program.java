package Post.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Post.entities.Comment;
import Post.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("have a nice trip!");
		Comment c2 = new Comment("Wow that awersome");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:06:44"),
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 5);
		p1.getComents().add(c1);
		p1.getComents().add(c2);
		
		System.out.println(p1);
		
	}

}
