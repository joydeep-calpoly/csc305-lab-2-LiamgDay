package JSON_processor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


final class Converter {
	//Converts JSONObject to dignitary with awards
	static void reader(JSONObject input) {
		String name = input.optString("name");
		JSONArray knownFor = input.optJSONArray("knownFor");
		List<Award> awards = new ArrayList<>();
		JSONArray awardsArray = input.optJSONArray("awards");
		for (int i = 0; i < awardsArray.length(); i++) {
			JSONObject JSONAward = awardsArray.optJSONObject(i);
			Award tempAward = new Award(JSONAward.optString("name"), JSONAward.optInt("year"));
			awards.add(tempAward);
		}
		Dignitary dignitary = new Dignitary(name, knownFor, awards);
		System.out.println(dignitary.toString());
	}
	

	static JSONObject creator(String input) throws JSONException {
		//creates JSONObject from string
		StringBuilder JSONText = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(input));
			String line;
			while (reader.ready()) {
				line = reader.readLine();
				JSONText.append(line).append("\n");
			}
			reader.close();
			JSONObject jsonObject = new JSONObject(JSONText.toString());
			return jsonObject;
		}
		catch (IOException e) {
			System.out.println("An error occured: " + e.getMessage());
		}
		return new JSONObject();
		
		
		
	}
		
	
}
