package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料信息同步
 *
 * @author auto create
 * @since 1.0, 2018-03-06 11:22:51
 */
public class AntMerchantExpandAssetinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4786566235929146428L;

	/**
	 * 传入需要反馈的物料信息对象列表.
	 */
	@ApiListField("asset_infos")
	@ApiField("asset_info_item")
	private List<AssetInfoItem> assetInfos;

	public List<AssetInfoItem> getAssetInfos() {
		return this.assetInfos;
	}
	public void setAssetInfos(List<AssetInfoItem> assetInfos) {
		this.assetInfos = assetInfos;
	}

}
