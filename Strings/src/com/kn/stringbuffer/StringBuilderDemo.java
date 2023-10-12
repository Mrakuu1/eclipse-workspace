package com.kn.stringbuffer;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ram");
		System.out.println("Data = " + sb);
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());

		System.out.println("*********************************");
		
		sb.append("Sita");
		sb.append("LakshmanRama ");
		System.out.println("Data = " + sb);
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());
	}

}
