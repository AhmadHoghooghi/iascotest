package ir.iasco.example.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(MyRequestManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyRequestEntity;
import ir.iasco.example.dao.MyRequestDao;

@Named("myRequestManager")
public class MyRequestManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<MyRequestEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MyRequestManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MyRequestManager(MyRequestDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private MyRequestDao getMyDao() {
		return (MyRequestDao) super.getDao();
	}

	/*PROTECTED REGION ID(MyRequestManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
