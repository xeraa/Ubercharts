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

package com.comsysto.insight.model.options.series.generic;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

import com.comsysto.insight.model.options.ChartType;

/**
 * Abstract implementation of ISeries, implementing all needed methods, except
 * for {@link ISeries#setData(Object)}. You should not need to implement this
 * class by your own as the existing implementations should cover all possible
 * variations supported by Highcharts.
 * <p/>
 * Date: Feb 18, 2011 Time: 6:06:55 PM
 * 
 * @author Mohammed El Batya
 * @see ISeries
 * @see com.comsysto.insight.model.options.series.impl.CoordinateSeries
 * @see com.comsysto.insight.model.options.series.impl.LabeledNumberSeries
 * @see com.comsysto.insight.model.options.series.impl.MixedSeries
 * @see com.comsysto.insight.model.options.series.impl.NumberSeries
 * @see com.comsysto.insight.model.options.series.impl.PointSeries
 */
abstract public class AbstractSeries<DataType> implements ISeries<DataType>, Serializable {
	private static final long serialVersionUID = -2312927306951165455L;

	/** {@link ISeries#getData()} */
	protected DataType mData = null;

	/** {@link ISeries#getName()} */
	private String mName = "";

	/** {@link ISeries#getStack()} */
	private String mStack = "";

	/** {@link ISeries#getType()} */
	private ChartType mType;

	/** {@link ISeries#getXAxis()} */
	private Integer mXAxis;

	/** {@link ISeries#getYAxis()} */
	private Integer mYAxis;

	/**
	 * Default Constructor for this series.
	 * <p/>
	 * Everything is set to its default value.
	 */
	public AbstractSeries() {
	}

	/**
	 * Constructor, which sets the mName for this series. Everything else is set
	 * to its default value.
	 * 
	 * @param pName
	 *            the mName for this series
	 * @see #setName(String)
	 */
	public AbstractSeries(String pName) {
		mName = pName;
	}

	/** {@link ISeries#getName()} */
	public String getName() {
		return mName;
	}

	/** {@link ISeries#setName(String)} */
	public ISeries<DataType> setName(String pName) {
		mName = pName;
		return this;
	}

	/** {@link ISeries#getStack()} */
	public String getStack() {
		return mStack;
	}

	/** {@link ISeries#setStack(String)} */
	public ISeries<DataType> setStack(String pStack) {
		mStack = pStack;
		return this;
	}

	/** {@link ISeries#getType()} */
	public ChartType getType() {
		return mType;
	}

	/** {@link ISeries#setType(com.comsysto.insight.model.options.ChartType) } */
	public ISeries<DataType> setType(ChartType pType) {
		mType = pType;
		return this;
	}

	/** {@link ISeries#getXAxis()} */
	@JsonProperty("xAxis")
	public Integer getXAxis() {
		return mXAxis;
	}

	/** {@link ISeries#setXAxis(Integer)} */
	public ISeries<DataType> setXAxis(Integer pXAxis) {
		mXAxis = pXAxis;
		return this;
	}

	/** {@link ISeries#getYAxis()} */
	@JsonProperty("yAxis")
	public Integer getYAxis() {
		return mYAxis;
	}

	/** {@link ISeries#setYAxis(Integer)} */
	public ISeries<DataType> setYAxis(Integer pYAxis) {
		mYAxis = pYAxis;
		return this;
	}

	/** {@link ISeries#getData()} */
	public DataType getData() {
		return mData;
	}

}
