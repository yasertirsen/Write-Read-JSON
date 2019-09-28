package jsonReadWrite;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile {

	public static void main(String[] args) {
		//Create a JSON parser to parse JSON object being read
		JSONParser parser = new JSONParser();
		
		try
		{
			//Create an object that parses the file being read and cast it into JSON object
			Object obj = parser.parse(new FileReader("myJSON.json"));
			JSONObject jsonObject = (JSONObject) obj;
			//Store values into variable and print out
			String name = (String) jsonObject.get("name");
			System.out.println("Name: " + name);
			
			String location = (String) jsonObject.get("location");
			System.out.println("Location: " + location);
			//Use iterator to loop through JSON Array in JSON object
			//loop array
			JSONArray coursesArray = (JSONArray) jsonObject.get("courses");
			Iterator<String> iterator = coursesArray.iterator();
			//Print out JSON Array
			while(iterator.hasNext())
			{
				System.out.println("Course: " + iterator.next());
			}
			
		}
		catch(FileNotFoundException e) { e.printStackTrace();}
		catch(IOException e) { e.printStackTrace();}
		catch(ParseException e) { e.printStackTrace();}
		catch(Exception e) { e.printStackTrace();}
		
		
	}

}
