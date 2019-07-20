package ir.iasco.example.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(MyRequestDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyRequestEntity;

@Repository
@Named("myRequestDao")
public class MyRequestDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<MyRequestEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MyRequestDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(MyRequestDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
