package JSON_processor;


final class Award {
	private final String title;
	private final int year;
	
	Award(String title, int year) {
		this.title = title;
		this.year = year;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(title).append(", ").append(year);
		return output.toString();
	}
	
}
