package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * pos订单信息上传接口
 *
 * @author auto create
 * @since 1.0, 2018-03-08 10:35:41
 */
public class KoubeiCateringPosOrderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5539174598775437298L;

	/**
	 * 设备商回流的设备信息列表
	 */
	@ApiListField("pos_device_infos")
	@ApiField("pos_device_info_v_o")
	private List<PosDeviceInfoVO> posDeviceInfos;

	/**
	 * 回流pos订单信息列表
	 */
	@ApiListField("pos_order_infos")
	@ApiField("pos_order_info_v_o")
	private List<PosOrderInfoVO> posOrderInfos;

	/**
	 * source_type+pos订单设备信息来源类型枚举+(isv回流数据: ISV, 设备商数据: META)
	 */
	@ApiField("source_type")
	private String sourceType;

	public List<PosDeviceInfoVO> getPosDeviceInfos() {
		return this.posDeviceInfos;
	}
	public void setPosDeviceInfos(List<PosDeviceInfoVO> posDeviceInfos) {
		this.posDeviceInfos = posDeviceInfos;
	}

	public List<PosOrderInfoVO> getPosOrderInfos() {
		return this.posOrderInfos;
	}
	public void setPosOrderInfos(List<PosOrderInfoVO> posOrderInfos) {
		this.posOrderInfos = posOrderInfos;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
