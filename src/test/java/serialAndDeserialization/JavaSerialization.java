package serialAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JavaSerialization {

	public static void main(String[] args) throws IOException {
		NFSGame user1=new NFSGame("ram", 1, 5000, 1);
		FileOutputStream fos=new FileOutputStream("./file.txt");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		objOut.writeObject(user1);
	}

}
