package ir.iasco.example.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(MyResponsibleManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyResponsibleEntity;
import ir.iasco.example.dao.MyResponsibleDao;

@Named("myResponsibleManager")
public class MyResponsibleManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<MyResponsibleEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MyResponsibleManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MyResponsibleManager(MyResponsibleDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private MyResponsibleDao getMyDao() {
		return (MyResponsibleDao) super.getDao();
	}

	/*PROTECTED REGION ID(MyResponsibleManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
