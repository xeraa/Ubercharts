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

import java.util.Map;

/**
 * Created by IntelliJ IDEA. User: elbatya Date: 15/03/2011 Time: 19:28 To
 * change this template use File | Settings | File Templates.
 */
public class ChartLabels {

	private ChartLabelItem[] mItems;
	private Map<String, String> mStyle;

	public ChartLabelItem[] getItems() {
		return mItems;
	}

	public ChartLabels setItems(ChartLabelItem[] pItems) {
		mItems = pItems;
		return this;
	}

	public Map<String, String> getStyle() {
		return mStyle;
	}

	public ChartLabels setStyle(Map<String, String> pStyle) {
		mStyle = pStyle;
		return this;
	}
}
