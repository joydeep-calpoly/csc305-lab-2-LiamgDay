package Jackson_Databind;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

final class Converter {
	static String creator(String input) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Dignitary dignitary = mapper.readValue(new File(input), Dignitary.class);
			return dignitary.toString();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return "error occured";
	}
}
	
	
	

