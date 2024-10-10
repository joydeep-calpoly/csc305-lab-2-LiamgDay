package JSON_processor;


final class Award {
	private String title;
	private int year;
	
	public Award(String title, int year) {
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
