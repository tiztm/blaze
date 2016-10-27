package com.ztm.biz.ctrl;

import com.jfinal.core.Controller;
import com.ztm.common.model.ZkPosts;

/**
 */
public class ZkController extends Controller {

	public void index() {
		setAttr("zkPage", ZkPosts.dao.paginate(getParaToInt(0, 1),100,false));
		render("zkpost.html");
	}

	public void rm() {
		setAttr("zkPage", ZkPosts.dao.paginate(getParaToInt(0, 1),100,true));
		render("zkpost.html");
	}

	public void jumpurl() {
		String url = ZkPosts.dao.findById(getParaToInt()).getUrl();
		redirect(url);
	}

	public void dataGrid() {
		render("dataGrid.html");
	}







}


