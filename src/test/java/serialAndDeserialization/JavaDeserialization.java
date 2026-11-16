
package serialAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("./file.txt");
		ObjectInputStream objInput=new ObjectInputStream(fis);
		NFSGame user1  = (NFSGame)objInput.readObject();
		System.out.println(user1.name);
		System.out.println(user1.level);
		System.out.println(user1.life);
		System.out.println(user1.score);
		
	}

}
