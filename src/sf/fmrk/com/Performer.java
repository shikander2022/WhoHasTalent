package sf.fmrk.com;

public class Performer {
	final int unionId;

	public Performer(int unionId) {

		this.unionId = unionId;
	}

	public String perform() {
		String output = unionId + " - performer";
		System.out.println(output);
		return output;
	}

}
