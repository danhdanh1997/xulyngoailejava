package b6;

import java.util.Scanner;

public class PhoneException extends Exception
{
	public PhoneException(String string) 
	{
		super(string);
	}
	
	static private String kiemtraphone(String string) throws PhoneException
	{
		if(string.length()==10 || string.length()==11)
		{
			System.out.println("so dien thoai hop le:");
			return string;
		}
		else 
		{
			throw new PhoneException("do  dai cua so dien thoai khong hop le:");
		}
	}
	
	public static void main(String[] args) throws PhoneException 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap vao day dien thoai:");
		String dienthoai = scanner.nextLine();
		
		kiemtraphone(dienthoai);
	}
}
















