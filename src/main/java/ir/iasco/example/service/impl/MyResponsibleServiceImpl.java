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

/*PROTECTED REGION ID(MyResponsibleServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyResponsibleEntity;
import ir.iasco.example.service.MyResponsibleService;
import ir.iasco.example.manager.MyResponsibleManager;

@Named("myResponsibleService")
@MapperEnabled
public class MyResponsibleServiceImpl
		extends
			AbstractCrudService<MyResponsibleEntity, java.lang.Long>
		implements
			MyResponsibleService {

	/*PROTECTED REGION ID(MyResponsibleServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MyResponsibleServiceImpl(MyResponsibleManager manager) {
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
	public MyResponsibleEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "post.pk", "post.toStr", "request.pk",
			"request.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public MyResponsibleEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"post.pk", "request.pk"}) MyResponsibleEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.post.toStr", "items.request.toStr"}, enrich = false)
	public DataPage<MyResponsibleEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(MyResponsibleServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
