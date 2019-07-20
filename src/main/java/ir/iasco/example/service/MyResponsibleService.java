package ir.iasco.example.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(MyResponsibleService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyResponsibleEntity;

@Path("/myResponsible/")
public interface MyResponsibleService
		extends
			EntityRestService<MyResponsibleEntity, java.lang.Long> {
	/*PROTECTED REGION ID(MyResponsibleService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
