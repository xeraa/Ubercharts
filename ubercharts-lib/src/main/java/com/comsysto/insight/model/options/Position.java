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

public class Position {

	private Align mAlign;
	private VerticalAlign mVerticalAlign;
	private Integer mX;
	private Integer mY;

	public Position() {
	}

	public Position(Align pAlign) {
		mAlign = pAlign;
	}

	public Position(Align pAlign, VerticalAlign pVerticalAlign) {
		mAlign = pAlign;
		mVerticalAlign = pVerticalAlign;
	}

	public Position(Align pAlign, VerticalAlign pVerticalAlign, Integer pX, Integer pY) {
		mAlign = pAlign;
		mVerticalAlign = pVerticalAlign;
		mX = pX;
		mY = pY;
	}

	public Align getAlign() {
		return mAlign;
	}

	public Position setAlign(Align pAlign) {
		mAlign = pAlign;
		return this;
	}

	public VerticalAlign getVerticalAlign() {
		return mVerticalAlign;
	}

	public Position setVerticalAlign(VerticalAlign pVerticalAlign) {
		mVerticalAlign = pVerticalAlign;
		return this;
	}

	public Integer getX() {
		return mX;
	}

	public Position setX(Integer pX) {
		mX = pX;
		return this;
	}

	public Integer getY() {
		return mY;
	}

	public Position setY(Integer pY) {
		mY = pY;
		return this;
	}
}