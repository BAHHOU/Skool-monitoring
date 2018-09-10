package ma.craft.monitorme.skool.api.requestmodel;

import java.util.Objects;

public class CreateSkoolerRequest {

	private final String name;

	public CreateSkoolerRequest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CreateSkoolerRequest that = (CreateSkoolerRequest) o;
		return Objects.equals(name, that.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
