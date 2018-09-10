package ma.craft.monitorme.skool.api.requestmodel;

import java.util.Objects;
import java.util.Optional;

//import javax.annotation.concurrent.Immutable;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

//@Immutable   
public class ListSkoolerRequest {

	private final String nameStartsWith;

	private ListSkoolerRequest(@Nullable String nameStartsWith) {
		this.nameStartsWith = nameStartsWith;
	}

	public Optional<String> getNameStartsWith() {
		return Optional.ofNullable(nameStartsWith);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ListSkoolerRequest that = (ListSkoolerRequest) o;
		return Objects.equals(nameStartsWith, that.nameStartsWith);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameStartsWith);
	}

	public static class Builder {
		private String nameStartsWith;

		public Builder nameStartsWith(@NonNull String value) {
			this.nameStartsWith = value;
			return this;
		}

		public ListSkoolerRequest build() {
			return new ListSkoolerRequest(nameStartsWith);
		}
	}
}
