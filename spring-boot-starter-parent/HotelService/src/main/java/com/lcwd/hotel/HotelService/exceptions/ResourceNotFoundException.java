package com.lcwd.hotel.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String s) {
		super(s);
		
	}
	ResourceNotFoundException() {
		super("Resource not found!!");

}
}
