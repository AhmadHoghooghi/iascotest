package ir.iasco.example.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(MyPostService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyPostEntity;

@Path("/myPost/")
public interface MyPostService
		extends
			EntityRestService<MyPostEntity, java.lang.Long> {
	/*PROTECTED REGION ID(MyPostService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
