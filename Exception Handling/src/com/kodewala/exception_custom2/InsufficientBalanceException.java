package com.kodewala.exception_custom2;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}