package com.oa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.dao.AppOrgGroupDao;
import com.oa.entityVo.EmployeesDeptVo;
import com.oa.entityVo.MenuTreeUtil;
import com.oa.javaBean.AppOrgGroup;

/**
 * @Description 类描述: 用户组
 * @author liang
 * @date 时间: 2019年2月28日 下午2:44:36
 */
@Controller
@RequestMapping("/AppOrgGroup")
public class AppOrgGroupController {

	@Autowired
	AppOrgGroupDao appOrgGroupDao;
	
	@ResponseBody
	@RequestMapping("/getReportTree")
	public List<Object> getReportTree(){
		 
		List<AppOrgGroup> groupTree = appOrgGroupDao.getOrgGroupTree();
		MenuTreeUtil menuTree = new MenuTreeUtil();
		List<Object> menuList = menuTree.menuList(groupTree);
		return menuList;
	}
	
	
	@ResponseBody
	@RequestMapping("/getReportUserTree")
	public List<EmployeesDeptVo> getReportUserTree(int grpId){
		
		List<EmployeesDeptVo> employeesDeptVo = appOrgGroupDao.getOrgGroupUserTree(grpId);	
		return employeesDeptVo;
	}
	
	@ResponseBody
	@RequestMapping("/getGroupNameId")
	public List<String> getGroupNameId(String id){
		
		
		List<String> groupNameIdList = appOrgGroupDao.getGroupNameId(id);
		return groupNameIdList;
	}
	
}
 
