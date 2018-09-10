package ma.craft.monitorme.skoolapidomain.entitygateway;

import java.util.List;

import ma.craft.monitorme.skoolapidomain.entity.Skooler;

public interface SkoolerEntityGateway {
	String saveSkooler(Skooler skooler);
	List<Skooler> findAll();
	List<Skooler> findByNameStartingWith(String name);
	Skooler findById(String id);
	boolean deleteSkoolerById(Skooler skooler);

}
