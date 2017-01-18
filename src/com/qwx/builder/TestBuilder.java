package com.qwx.builder;

public class TestBuilder {

	public static void main(String[] arg) {
		Builder builder = new SonyBuilder();
		// 导演持有builder的引用
		Director director = new Director(builder);
		director.construct("索尼摄像头", "1280x720像素", "4核因特尔CPU");
		Phone phone = builder.create();
		System.out.println(phone.toString());

		director.construct("索尼摄像头");
		Phone phone2 = builder.create();
		System.out.println(phone2.toString());

		director.construct();
		Phone phone3 = builder.create();
		System.out.println(phone3.toString());

	}

}
