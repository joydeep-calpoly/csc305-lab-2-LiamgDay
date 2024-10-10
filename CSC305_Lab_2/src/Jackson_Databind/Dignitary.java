package Jackson_Databind;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

final class Dignitary {
	private final String name;
	private final List<String> knownFor;
	private final List<Award> awards;
	
	@JsonCreator
	private Dignitary(@JsonProperty("name") String name,
			@JsonProperty("knownFor") List<String> knownFor, 
			@JsonProperty("awards") List<Award> awards){
		this.name = name;
		this.knownFor = knownFor;
		this.awards = awards;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(name).append("\n");
		output.append("Known For: \n");
		for (String accomplishment : knownFor) {
			output.append("     ").append(accomplishment).append("\n");
		}
		output.append("Awards:\n");
		for (Award award : awards) {
			output.append("     ").append(award.toString()).append("\n");
		}
		return output.toString();
		
	}
}


