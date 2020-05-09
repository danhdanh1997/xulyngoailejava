package b5;

import java.util.Scanner;

public class PINException extends Exception
{
	
	
	public PINException (String s) 
	{
		super(s);
	}
	
	@SuppressWarnings("unused")
	static private String kiemtrapin(String string) throws PINException
	{
//		System.out.println("nhap vao ma pin");
//		Scanner scanner = new Scanner(System.in);
//		
//		string = scanner.nextLine();
		if(string.length() ==4 )
		{
			System.out.println("ma pin dung dinh dang:");
			return string;
			
		}
		else 
		{
			throw new PINException("ma pin khong dung dinh dang:");
		}
	}
	
	public static void main(String[] args) throws PINException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao ma pin");
		String mapin = scanner.nextLine();
		kiemtrapin(mapin);
	}
}















