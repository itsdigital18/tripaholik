package com.konchapp.exception;

public class KonchException extends Exception{
	
	public KonchException(){
		super();
		System.out.println("Exception Messages:");
	}
	
public KonchException(String excepCause,Throwable thr){
		super(excepCause,thr);

		System.out.println("Exception Messages1:"+excepCause);
	}

public KonchException(String excepCause){
	
	super(excepCause);
	System.out.println("Exception Messages2:"+excepCause);
	
}

}
