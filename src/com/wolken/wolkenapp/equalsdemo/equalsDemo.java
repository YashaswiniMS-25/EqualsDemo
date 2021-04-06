package com.wolken.wolkenapp.equalsdemo;

public class equalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="yashu";//literal
		//String name2="yashu";
		//String name1=new String("yashu");
		String name2=new String("yashu");
		if(name1.equals(name2)){
			System.out.println("Same");
		}
		else {
			System.out.println("different");
		}

	}

}
