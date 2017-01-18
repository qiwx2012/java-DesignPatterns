package com.qwx.builder;

//
public class Director {

	Builder builder;
	String mScreen = "1920*720";
	String mCpu = "˫��";
	String mCamera = "Ĭ��Ʒ������ͷ";

	public Director(Builder builder) {
		this.builder = builder;
	}

	// ����������������builder��Ӧ�ķ���
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
