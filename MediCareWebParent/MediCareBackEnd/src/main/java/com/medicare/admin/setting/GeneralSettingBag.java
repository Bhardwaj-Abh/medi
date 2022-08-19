package com.medicare.admin.setting;

import java.util.List;

import com.medicare.common.entity.setting.Setting;
import com.medicare.common.entity.setting.SettingBag;

public class GeneralSettingBag extends SettingBag {

	public GeneralSettingBag(List<Setting> listSettings) {
		super(listSettings);
	}

	public void updateCurrencySymbol(String value) {
		super.update("CURRENCY_SYMBOL", value);
	}
	
	public void updateSiteLogo(String value) {
		super.update("SITE_LOGO", value);
	}
}
