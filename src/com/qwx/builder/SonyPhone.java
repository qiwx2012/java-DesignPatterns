package com.qwx.builder;

//具体产品类
public class SonyPhone extends Phone {

	@Override
	public void setSystem() {
		mSystem="Android";
		
	}
	@Override
	public String toString() {
		return "SonyPhone [mCPU=" + mCup + ", mCamera=" + mCamera
                + ", mScreen=" + mScreen + ", mSystem=" + mSystem + "]";
	}
}
