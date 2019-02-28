package com.oa.entityVo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.oa.javaBean.AppOrgGroup;

public class MenuTreeUtil {

	public static Map<String, Object> mapArray = new LinkedHashMap<String, Object>();
	public List<AppOrgGroup> menuCommon;
	public List<Object> list = new ArrayList<Object>();

	/**
	 * id：节点ID，对加载远程数据很重要。
text：显示节点文本。
state：节点状态，'open' 或 'closed'，默认：'open'。如果为'closed'的时候，将不自动展开该节点。
checked：表示该节点是否被选中。
attributes: 被添加到节点的自定义属性。
children: 一个节点数组声明了若干节点。
	 * @param menu
	 * @return
	 * @Description 方法描述:  页面插件要的字段
	 * @author liang
	 * @date 时间: 2019年2月26日 下午7:19:35
	 */
	public List<Object> menuList(List<AppOrgGroup> menu) {
		this.menuCommon = menu;
		for (AppOrgGroup orgGroup : menu) {
			Map<String, Object> mapArr = new LinkedHashMap<String, Object>();
			if (orgGroup.getPgrpId() == 0) {
				mapArr.put("id",  orgGroup.getGrpId());
				mapArr.put("text", orgGroup.getGrpLevel()+""+orgGroup.getGrpName());
				mapArr.put("attributes", orgGroup);
				List<?> menuChild = menuChild(orgGroup.getGrpId());
				if (menuChild!=null && menuChild.size()>0) {
					mapArr.put("state", "closed");
				}
				mapArr.put("children", menuChild);
				
				list.add(mapArr);
			}
		}
		return list;
	}
	 
	public List<?> menuChild(int id) {
		List<Object> lists = new ArrayList<Object>();
		for (AppOrgGroup orgGroup : menuCommon) {
			Map<String, Object> childArray = new LinkedHashMap<String, Object>();
			if (orgGroup.getPgrpId() == id) {
				childArray.put("id", orgGroup.getGrpId());
				childArray.put("text", orgGroup.getGrpLevel()+""+orgGroup.getGrpName());
				childArray.put("attributes", orgGroup);
				List<?> menuChild = menuChild(orgGroup.getGrpId());
				if (menuChild!=null && menuChild.size()>0) {
					childArray.put("state", "closed");
				}
				
				childArray.put("children", menuChild);
				lists.add(childArray);
			}
		}
		return lists;
	}

}
