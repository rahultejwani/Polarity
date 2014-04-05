package rt.bean;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


/**
 * @Author rahultejwani
 */
public class DictionaryBean{
	private HashMap<String, Double> Dictionary = new HashMap<>();
	public DictionaryBean()
	{
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(new propertyBean().getLexiconPath()));
			System.out.println("Loading the Sentiword Dictionary");
			String line;
			while((line = br.readLine()) != null)
			{
				String [] row = line.split("\\t");
				Dictionary.put(row[0], Double.parseDouble(row[1]));
			}
			br.close();
			System.out.println("Dictionary Load Complete :)");

		} catch (FileNotFoundException e) {

			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {

			System.out.println("IO exception");
			e.printStackTrace();
		}
	}


	public HashMap<String, Double> getDictionary() {
		return this.Dictionary;
	}


}
