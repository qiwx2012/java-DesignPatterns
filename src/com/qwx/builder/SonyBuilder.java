package com.qwx.builder;

//À˜ƒ· µœ÷builder¿‡
public class SonyBuilder extends Builder {

	SonyPhone sonyPhone;

	public SonyBuilder() {
		sonyPhone = new SonyPhone();
	}

	@Override
	public void builderScreen(String sreen) {
		sonyPhone.setmScreen(sreen);

	}

	@Override
	public void builderCamera(String camera) {
		sonyPhone.setmCamera(camera);

	}

	@Override
	public void builderCpu(String cpu) {
		sonyPhone.setmCup(cpu);

	}

	@Override
	public Phone create() {
		// TODO Auto-generated method stub
		return sonyPhone;
	}

	@Override
	public void buildSystem() {
		sonyPhone.setSystem();

	}

}
