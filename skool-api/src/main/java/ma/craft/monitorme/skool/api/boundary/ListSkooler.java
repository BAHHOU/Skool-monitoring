package ma.craft.monitorme.skool.api.boundary;

import java.util.function.Consumer;

import ma.craft.monitorme.skool.api.requestmodel.ListSkoolerRequest;
import ma.craft.monitorme.skool.api.responsemodel.SkoolerResponseModel;


@FunctionalInterface
@Boundary
public interface ListSkooler {
	void execute(ListSkoolerRequest request, Consumer<SkoolerResponseModel> responseModelFunction);
}
