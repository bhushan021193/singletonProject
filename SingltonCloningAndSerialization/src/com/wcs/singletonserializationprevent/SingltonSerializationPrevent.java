package com.wcs.singletonserializationprevent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingltonSerializationPrevent {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	AA aa=AA.getInstance();
	
	System.out.println(aa);
	
	
	ObjectOutput out=new ObjectOutputStream(new FileOutputStream("fole.txt"));
	out.writeObject(aa);
	out.close();
	
	ObjectInput in=new ObjectInputStream(new FileInputStream("fole.txt"));
	AA aa2=(AA)in.readObject();
	in.close();
	System.out.println(aa2);
	
}
}
