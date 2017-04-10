package sf.fmrk.com;

public class Vocalist extends Performer {

	public Vocalist(int unionId) {
		super(unionId);
	}

	public String perform(String key) {
		String output = "I sing in the key of - " + key + " - " + unionId;
		System.out.println(output);
		return output;
	}

	public String perform(String key, int volume) {
		String output = "I sing in the key of - " + key + " - at the volume "
				+ volume
				+ " - " + unionId;
		System.out.println(output);
		return output;
	}
}
