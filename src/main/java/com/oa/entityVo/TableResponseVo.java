package com.oa.entityVo;

import java.util.List;

/**
 * 
 * @Description 类描述: layui Table的返回值
 * @author liang
 * @date 时间: 2019年3月4日 上午10:16:56
 */
public class TableResponseVo {

	private int code = 0;// 状态字段成功值
	private String msg = "";// 消息字段
	private int count;
	private List<?> data;// 数据字段

	public TableResponseVo(int code, String msg, int count, List<?> data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	public TableResponseVo(int count, List<?> data) {
		super();
		this.count = count;
		this.data = data;
	}
	
	public TableResponseVo(List<?> data) {
		super();
		this.data = data;
	}

	public TableResponseVo() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}
