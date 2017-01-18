package com.qwx.builder;

public class TestBuilder {

	public static void main(String[] arg) {
		Builder builder = new SonyBuilder();
		// ���ݳ���builder������
		Director director = new Director(builder);
		director.construct("��������ͷ", "1280x720����", "4�����ض�CPU");
		Phone phone = builder.create();
		System.out.println(phone.toString());

		director.construct("��������ͷ");
		Phone phone2 = builder.create();
		System.out.println(phone2.toString());

		director.construct();
		Phone phone3 = builder.create();
		System.out.println(phone3.toString());

	}

}
