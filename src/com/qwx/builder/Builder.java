package com.qwx.builder;

//抽象Builder
public abstract class Builder {

	public abstract void builderScreen(String sreen);

	public abstract void builderCamera(String camera);

	public abstract void builderCpu(String cpu);

	/**
	 * 获得我们建造的Product对象
	 * 
	 * @return
	 */
	public abstract Phone create();

	public abstract void buildSystem();

}
