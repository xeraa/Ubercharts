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

package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.ChartType;

/**
 * This is a shorthand for {@code new Chart(Type.spline)} or
 * {@code new Chart().setDefaultSeriesType(Type.spline)}.
 * <p/>
 * Date: Feb 18, 2011 Time: 3:06:22 PM
 * 
 * @author Mohammed El Batya
 * @see Chart
 */
public class SplineChart extends Chart {
	private static final long serialVersionUID = 1905705712159259468L;

	public SplineChart() {
		super(ChartType.spline);
	}
}
