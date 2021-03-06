/*
 Copyright 2011 comSysto GmbH

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.comsysto.insight.model.options;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by IntelliJ IDEA. User: elbatya Date: 08/03/2011 Time: 15:24 To
 * change this template use File | Settings | File Templates.
 */
public class Navigation implements Serializable {
	private static final long serialVersionUID = 3730930827716528975L;

	private Map<String, String> mMenuStyle;
	private Map<String, String> mMenuItemStyle;
	private Map<String, String> mMenuItemHoverStyle;
	private ButtonOptions mButtonsOptions;

	public Map<String, String> getMenuStyle() {
		return mMenuStyle;
	}

	public Navigation setMenuStyle(Map<String, String> pMenuStyle) {
		mMenuStyle = pMenuStyle;
		return this;
	}

	public Map<String, String> getMenuItemStyle() {
		return mMenuItemStyle;
	}

	public Navigation setMenuItemStyle(Map<String, String> pMenuItemStyle) {
		mMenuItemStyle = pMenuItemStyle;
		return this;
	}

	public Map<String, String> getMenuItemHoverStyle() {
		return mMenuItemHoverStyle;
	}

	public Navigation setMenuItemHoverStyle(Map<String, String> pMenuItemHoverStyle) {
		mMenuItemHoverStyle = pMenuItemHoverStyle;
		return this;
	}

	public ButtonOptions getButtonsOptions() {
		return mButtonsOptions;
	}

	public Navigation setButtonsOptions(ButtonOptions pButtonsOptions) {
		mButtonsOptions = pButtonsOptions;
		return this;
	}
}
