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


final class main {
	

	

	public static void main(String[] args) throws JSONException  {
		Converter.reader(Converter.creator("input1.json"));
		Converter.reader(Converter.creator("input2.json"));
		Converter.reader(Converter.creator("input3.json"));
		
	}
		
		
	
}
