package jsonReadWrite;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Create JSON object with object keys/values
		JSONObject obj = new JSONObject();
		obj.put("name", "Yaser Tirsen");
		obj.put("location", "Ireland");
		
		//Create JSON array to store course names
		JSONArray list = new JSONArray();
		list.add("Java");
		list.add("JSP");
		list.add("Servlets");
		//Add course names to the JSON object
		obj.put("courses", list);
		//Write the file out and print JSON object
		try (FileWriter file = new FileWriter("myJSON.json"))
		{
			file.write(obj.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(obj);
	}
}
