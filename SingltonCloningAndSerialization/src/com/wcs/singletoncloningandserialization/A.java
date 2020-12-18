package com.wcs.singletoncloningandserialization;

import javax.management.InstanceAlreadyExistsException;

public class A extends B{
	private static A a;

	private A() throws InstanceAlreadyExistsException {
if(a!=null) {
		throw new InstanceAlreadyExistsException();}
	}

	public static A singleObject() throws InstanceAlreadyExistsException {

		if (a == null) {

			a = new A();
			

		}
		return a;

	}
	
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return a;
}
}
