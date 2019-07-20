package ir.iasco.example.service.impl;
import java.util.Map;

import ir.asta.wise.core.crud.*;
import ir.asta.wise.core.datamanagement.*;
import ir.asta.wise.core.remoting.rs.Include;
import ir.asta.wise.core.remoting.rs.Includes;
import ir.asta.wise.core.util.beancopier.Mapper;
import ir.asta.wise.core.util.beancopier.MapperEnabled;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/*PROTECTED REGION ID(MyRequestServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyRequestEntity;
import ir.iasco.example.service.MyRequestService;
import ir.iasco.example.manager.MyRequestManager;

@Named("myRequestService")
@MapperEnabled
public class MyRequestServiceImpl
		extends
			AbstractCrudService<MyRequestEntity, java.lang.Long>
		implements
			MyRequestService {

	/*PROTECTED REGION ID(MyRequestServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MyRequestServiceImpl(MyRequestManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public MyRequestEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public MyRequestEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(
			@Mapper(value = {"*"}) MyRequestEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.responsibles.toStr"}, enrich = false)
	public DataPage<MyRequestEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(MyRequestServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
