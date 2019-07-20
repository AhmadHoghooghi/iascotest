package ir.iasco.example.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(MyRequestService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyRequestEntity;

@Path("/myRequest/")
public interface MyRequestService
		extends
			EntityRestService<MyRequestEntity, java.lang.Long> {
	/*PROTECTED REGION ID(MyRequestService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
