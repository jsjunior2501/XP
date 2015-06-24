package br.eng.rafaelsouza.dingdong;

import javax.naming.directory.InvalidAttributesException;

/**
 *  
 *  Write a program that prints the numbers from 1 to 100. 
 *  But for multiples of three print “Ding” instead of the number and for the multiples of five print “Dong”. 
 *  For numbers which are multiples of both three and five print “DingDong”."
 *
 */
public class DingDong {
	
	public String calcular(int i) 
	{	
		if (i>100)
			throw new IllegalArgumentException();

		if(i < 0)
			return "";

		if(i%3 == 0 && i%5 == 0 && i%7 == 0 )
			return	"DingDongDung";
		
		if(i%7 == 0 )
			return	"Dung";

		
		if(i%3 == 0 && i%5 == 0)
			return	"DingDong";
					
		if (i%3 == 0)
			return "Ding";
		
		if (i%5 == 0)
			return "Dong";
		
		return (String.valueOf(i));
		
		
	}	
}
