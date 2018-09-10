package ma.craft.monitorme.skool.api.boundary;

import java.util.function.Consumer;

import ma.craft.monitorme.skool.api.requestmodel.GetSkoolerRequest;
import ma.craft.monitorme.skool.api.responsemodel.SkoolerResponseModel;

@FunctionalInterface
@Boundary
public interface GetSkooler {
	void execute(GetSkoolerRequest request, Consumer<SkoolerResponseModel> responseModelFunction);
}
