package com.qwx.builder;

//�����Ʒ��
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
