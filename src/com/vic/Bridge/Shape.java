package com.vic.Bridge;

public abstract class Shape {

	public DrawAPI drawAPI;
	public Shape(DrawAPI drawAPI) {
		// TODO Auto-generated constructor stub
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
