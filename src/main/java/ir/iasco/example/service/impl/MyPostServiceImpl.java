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

/*PROTECTED REGION ID(MyPostServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.iasco.example.entities.MyPostEntity;
import ir.iasco.example.service.MyPostService;
import ir.iasco.example.manager.MyPostManager;

@Named("myPostService")
@MapperEnabled
public class MyPostServiceImpl
		extends
			AbstractCrudService<MyPostEntity, java.lang.Long>
		implements
			MyPostService {

	/*PROTECTED REGION ID(MyPostServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MyPostServiceImpl(MyPostManager manager) {
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
	public MyPostEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public MyPostEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(
			@Mapper(value = {"*"}) MyPostEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.responsibilites.toStr"}, enrich = false)
	public DataPage<MyPostEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(MyPostServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
