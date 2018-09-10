package ma.craft.monitorme.skool.api.requestmodel;

import java.util.Objects;

public class GetSkoolerRequest {

	private final String skoolerId;

	public GetSkoolerRequest(String skoolerId) {
		this.skoolerId = skoolerId;
	}

	public String getskoolerId() {
		return skoolerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GetSkoolerRequest that = (GetSkoolerRequest) o;
		return Objects.equals(skoolerId, that.skoolerId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(skoolerId);
	}
}
