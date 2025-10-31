<<<<<<< HEAD
package com.mysite.sbb;

import lombok.Getter;

@Getter
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
	public HelloLombok(String hello,int lombok) {
		this.hello =hello;
		this.lombok = lombok;
	}
	
	public static void main(String[] args) {
		HelloLombok helloLombok =new HelloLombok("헬로",5);
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
		
	}
	
}
=======
package com.mysite.sbb;

import lombok.Getter;

@Getter
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
	public HelloLombok(String hello,int lombok) {
		this.hello =hello;
		this.lombok = lombok;
	}
	
	public static void main(String[] args) {
		HelloLombok helloLombok =new HelloLombok("헬로",5);
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
		
	}
	
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
