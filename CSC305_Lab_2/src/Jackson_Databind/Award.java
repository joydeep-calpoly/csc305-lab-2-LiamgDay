package Jackson_Databind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

final class Award {
	private final String name;
	private final int year;
	
	@JsonCreator
	private Award(@JsonProperty("name") String name, @JsonProperty("year") int year) {
		this.name = name;
		this.year = year;
	}	
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(name).append(", ").append(year);
		return output.toString();
	}
}
