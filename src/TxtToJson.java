import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jdk.nashorn.internal.parser.JSONParser;

public class TxtToJson {
	
private static final String FILENAME = "C:/Users/etuna/Desktop/testRaw.txt";
private static final String GENERATIONLOCATION = "C:/Users/etuna/Desktop/scriptOutputTest.json";
static BufferedReader br;
static FileReader fr;
static BufferedWriter bw;

public static void main(String []args) throws IOException {

try {
		
	fr = new FileReader(FILENAME);
	br = new BufferedReader(fr);
	String content = "";
	String currLine;
	while((currLine = br.readLine()) != null) {
		content += currLine+System.lineSeparator();
	}
	

bw = new BufferedWriter(new FileWriter(GENERATIONLOCATION));
bw.write(content);

System.out.println("works");
System.out.println(content);
	
	
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} finally {
	try {

		if (br != null)
			br.close();

		if (fr != null)
			fr.close();

		if (bw != null)
			bw.close();
	} catch (IOException ex) {

		ex.printStackTrace();

	}
}







	
}

}
