package ma.craft.monitorme.skoolapidomain.entity;

public class SkoolerFactory {

	private SkoolerFactory() {}
	
	public Skooler createSkooler(String id, String name, String jobPosition, String email) {
		return new Skooler(id, name, jobPosition, email);
	}
	
	public static SkoolerFactory create() {
		return new SkoolerFactory();
	}
}

