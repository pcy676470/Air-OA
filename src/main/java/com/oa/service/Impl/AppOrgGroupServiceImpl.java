package com.oa.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.AppOrgGroupDao;
import com.oa.service.AppOrgGroupService;

@Transactional
@Service
public class AppOrgGroupServiceImpl implements AppOrgGroupService{
	
	@Autowired
	AppOrgGroupDao appOrgGroupDao;
	
	
}
 