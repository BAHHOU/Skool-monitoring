package ma.craft.monitorme.skool.api.responsemodel;

import java.util.Objects;


public class SkoolerResponseModel {

	private final String id;
	private final String name;
	private final String jobPosition;
	private final String email;

	public SkoolerResponseModel(String id, String name, String jobPosition, String email) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SkoolerResponseModel that = (SkoolerResponseModel) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(name, that.name) && 
				Objects.equals(jobPosition, that.jobPosition) && 
				Objects.equals(email, that.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, jobPosition, email);
	}
}
