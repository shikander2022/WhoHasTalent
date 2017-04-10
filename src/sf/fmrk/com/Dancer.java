package sf.fmrk.com;

public class Dancer extends Performer {

	private final String style;

	public Dancer(String style, int unionId) {
		super(unionId);
		this.style = style;
	}

	public String perform() {
		// “tap - 772 - dancer”
		String output = style + " - " + unionId + " - dancer";
		System.out.println(output);
		return output;
	}

}
