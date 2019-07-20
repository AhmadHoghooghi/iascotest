package ir.iasco.example.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(MyPostManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyPostEntity;
import ir.iasco.example.dao.MyPostDao;

@Named("myPostManager")
public class MyPostManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<MyPostEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MyPostManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MyPostManager(MyPostDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private MyPostDao getMyDao() {
		return (MyPostDao) super.getDao();
	}

	/*PROTECTED REGION ID(MyPostManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
