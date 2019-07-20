package ir.iasco.example.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(MyResponsibleDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyResponsibleEntity;

@Repository
@Named("myResponsibleDao")
public class MyResponsibleDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<MyResponsibleEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MyResponsibleDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(MyResponsibleDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
