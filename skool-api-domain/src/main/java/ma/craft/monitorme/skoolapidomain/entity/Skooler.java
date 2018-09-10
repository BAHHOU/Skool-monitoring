package ma.craft.monitorme.skoolapidomain.entity;

public class Skooler {

	private String id;
	private String name;
	private String jobPosition;
	private String email;

	public Skooler(String id, String name, String jobPosition, String email) {
		super();
		this.id = id;
		this.name = name;
		this.jobPosition = jobPosition;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public String getEmail() {
		return email;
	}

}
