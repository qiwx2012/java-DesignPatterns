package com.qwx.builder;

//
public class Director {

	Builder builder;
	String mScreen = "1920*720";
	String mCpu = "双核";
	String mCamera = "默认品牌摄像头";

	public Director(Builder builder) {
		this.builder = builder;
	}

	// 在这个方法里面调用builder相应的方法
	public void construct(String camera, String screen, String cpu) {

		builder.builderCamera(camera);
		builder.builderScreen(screen);
		builder.builderCpu(cpu);
		builder.buildSystem();
	}

	public void construct(String camera) {
		this.construct(camera, mScreen, mCpu);

	}

	public void construct() {
		this.construct(mCamera, mScreen, mCpu);

	}

}
