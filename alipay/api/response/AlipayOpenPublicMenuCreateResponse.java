package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-27 14:38:40
 */
public class AlipayOpenPublicMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3195151879399524575L;

	/** 
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
