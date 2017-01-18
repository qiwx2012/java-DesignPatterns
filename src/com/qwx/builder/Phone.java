package com.qwx.builder;

//≥ÈœÛProduct¿‡

public abstract class Phone {

	protected String mCup;
	protected String mCamera;
	protected String mScreen;

	protected String mSystem;

	public abstract void setSystem();

	public String getmCup() {
		return mCup;
	}

	public void setmCup(String mCup) {
		this.mCup = mCup;
	}

	public String getmCamera() {
		return mCamera;
	}

	public void setmCamera(String mCamera) {
		this.mCamera = mCamera;
	}

	public String getmScreen() {
		return mScreen;
	}

	public void setmScreen(String mScreen) {
		this.mScreen = mScreen;
	}
	

}
