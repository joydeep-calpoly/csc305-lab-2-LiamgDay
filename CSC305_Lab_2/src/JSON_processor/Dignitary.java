package JSON_processor;

import java.util.List;

import org.json.JSONArray;

final class Dignitary {
	private final String name;
	private final JSONArray knownFor;
	private final List<Award> awards;
	
	Dignitary(String name, JSONArray knownFor, List<Award> awards) {
		this.name = name;
		this.knownFor = knownFor;
		this.awards = awards;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(name).append("\n");
		output.append("Known For:\n");
		//for-each not acceptable with JSONArray
		for (int i = 0; i < knownFor.length(); i++) {
			output.append("     ").append(knownFor.optString(i)).append("\n");
			}
		output.append("Awards:\n");
		for (Award award : awards) {
			output.append("     ").append(award.toString()).append("\n");
		}
		return output.toString();
		}
}
