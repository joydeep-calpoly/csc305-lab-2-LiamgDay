package JSON_processor;

import org.json.JSONException;

final class main {
	

	

	public static void main(String[] args) throws JSONException  {
		Converter.reader(Converter.creator("input1.json"));
		Converter.reader(Converter.creator("input2.json"));
		Converter.reader(Converter.creator("input3.json"));
		
	}
		
		
	
}
