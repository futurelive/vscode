package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-14 10:42:35
 */
public class AlipayMarketingCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833227737759336323L;

	/** 
	 * 支付宝卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
