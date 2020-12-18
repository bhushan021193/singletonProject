package com.wcs.singletoncloningandserialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.management.InstanceAlreadyExistsException;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			InstanceAlreadyExistsException {

		A a = A.singleObject();
		System.out.println(a);

	}
}
