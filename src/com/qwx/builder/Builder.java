package com.qwx.builder;

//����Builder
public abstract class Builder {

	public abstract void builderScreen(String sreen);

	public abstract void builderCamera(String camera);

	public abstract void builderCpu(String cpu);

	/**
	 * ������ǽ����Product����
	 * 
	 * @return
	 */
	public abstract Phone create();

	public abstract void buildSystem();

}
