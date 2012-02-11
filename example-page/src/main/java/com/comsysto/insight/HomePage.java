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

package com.comsysto.insight;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.AreaChart;
import com.comsysto.insight.model.charts.AreaSplineChart;
import com.comsysto.insight.model.charts.BarChart;
import com.comsysto.insight.model.charts.ColumnChart;
import com.comsysto.insight.model.charts.LineChart;
import com.comsysto.insight.model.charts.PieChart;
import com.comsysto.insight.model.charts.ScatterChart;
import com.comsysto.insight.model.charts.SplineChart;
import com.comsysto.insight.model.options.AxisTitle;
import com.comsysto.insight.model.options.ChartTitle;
import com.comsysto.insight.model.options.Credits;
import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.Subtitle;
import com.comsysto.insight.model.options.ZoomType;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.CoordinateSeries;
import com.comsysto.insight.model.options.series.impl.LabeledNumberSeries;
import com.comsysto.insight.model.options.series.impl.MixedSeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import com.comsysto.insight.model.options.series.impl.PointSeries;

/** Homepage */
public class HomePage extends WebPage {

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
	public HomePage(final PageParameters parameters) {

		String[] categories = new String[] { "Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul",
				"Aug", "Sep", "Oct", "Nov", "Dec" };

		Credits credits = new Credits("comSysto GmbH").setHref("http://www.comsysto.com");

		ISeries<Number[]> a = new NumberSeries("Number").setData(new Number[] { 7.0, 6.9, 9.5,
				10.2, 12.2, 13.9 });

		ISeries<Object[]> b = new MixedSeries("Mixed").setData(new Object[] { -0.2, 0.8, 4.4,
				new Object[] { "max", 50 }, new Integer[] { 4, 1 } });

		ISeries<Object[][]> c = new LabeledNumberSeries("LabeledNumber").setData(new Object[][] {
				new Object[] { "max", 20 }, new Object[] { "min", -5 } });

		CoordinateSeries d = new CoordinateSeries("Coords").setData(new Number[] { 3.9, 4.2, 5.7,
				7.5, 2.3 }, new Number[] { 3.9, 4.2, 5.7, 7.5, 2.3 });

		ISeries<Point[]> e = new PointSeries("Points").setData(new Point[] { new Point(1, 5),
				new Point(3, 4), new Point(6, 7) });

		Highchart highchart1 = new Highchart(new AreaChart(), a, c, d, e);
		highchart1.setTitle(new ChartTitle("AreaChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart2 = new Highchart(new AreaSplineChart(), a, c, d, e);
		highchart2.setTitle(new ChartTitle("AreaSplineChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart3 = new Highchart(new BarChart(), a, c, d, e);
		highchart3.setTitle(new ChartTitle("BarChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart4 = new Highchart(new ColumnChart(), a, c, d, e);
		highchart4.setTitle(new ChartTitle("ColumnChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart5 = new Highchart(new LineChart(), a, c, d, e);
		highchart5.setTitle(new ChartTitle("LineChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart6 = new Highchart(new PieChart(), a, c, d, e);
		highchart6.setTitle(new ChartTitle("PieChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart7 = new Highchart(new ScatterChart(), a, c, d, e);
		highchart7.setTitle(new ChartTitle("ScatterChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart8 = new Highchart(new SplineChart(), a, c, d, e);
		highchart8.setTitle(new ChartTitle("SplineChart")).setCredits(credits).getXAxis()
				.setCategories(categories);

		Highchart highchart9 = new Highchart(new LineChart(), b);
		highchart9.setTitle(new ChartTitle("LineChart"));
		highchart9.setSubtitle(new Subtitle("Mixed Series"));
		highchart9.getXAxis().setCategories(categories).setTitle(new AxisTitle("Time"));
		highchart9.getYAxis().setTitle(new AxisTitle("Amount"));
		highchart9.setCredits(credits);
		highchart9.getChart().setZoomType(ZoomType.x);

		// Add Panel
		add(new HighchartsPanel("chart1", highchart1));
		add(new HighchartsPanel("chart2", highchart2));
		add(new HighchartsPanel("chart3", highchart3));
		add(new HighchartsPanel("chart4", highchart4));
		add(new HighchartsPanel("chart5", highchart5));
		add(new HighchartsPanel("chart6", highchart6));
		add(new HighchartsPanel("chart7", highchart7));
		add(new HighchartsPanel("chart8", highchart8));
		add(new HighchartsPanel("chart9", highchart9));
	}

}
