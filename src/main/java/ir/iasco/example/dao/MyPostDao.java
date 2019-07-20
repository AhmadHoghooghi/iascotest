package ir.iasco.example.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(MyPostDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyPostEntity;

@Repository
@Named("myPostDao")
public class MyPostDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<MyPostEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MyPostDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(MyPostDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
