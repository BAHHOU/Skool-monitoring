package ma.craft.monitorme.skool.api.boundary;

import java.util.function.Consumer;

import ma.craft.monitorme.skool.api.requestmodel.CreateSkoolerRequest;

@FunctionalInterface
@Boundary
public interface CreateSkooler {
	void execute(CreateSkoolerRequest request);

}
