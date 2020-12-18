package com.wcs.singletonserializationprevent;

import java.io.Serializable;

public class AA implements Serializable {
	private static AA a;

	private AA() {

	}

	public static AA getInstance() {

		if (a == null) {

			a = new AA();
		}
		return a;
	}

	protected Object readResolve() {
		return a;
	}

}
