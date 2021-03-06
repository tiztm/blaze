package com.ztm.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseZkPosts<M extends BaseZkPosts<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}

	public java.lang.String getUrl() {
		return get("url");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setTimeS(java.util.Date timeS) {
		set("timeS", timeS);
	}

	public java.util.Date getTimeS() {
		return get("timeS");
	}

	public void setHuifuNum(java.lang.Integer huifuNum) {
		set("huifuNum", huifuNum);
	}

	public java.lang.Integer getHuifuNum() {
		return get("huifuNum");
	}

	public void setReadNum(java.lang.Integer readNum) {
		set("readNum", readNum);
	}

	public java.lang.Integer getReadNum() {
		return get("readNum");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public void setSendStatus(java.lang.Integer sendStatus) {
		set("sendStatus", sendStatus);
	}

	public java.lang.Integer getSendStatus() {
		return get("sendStatus");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

}
