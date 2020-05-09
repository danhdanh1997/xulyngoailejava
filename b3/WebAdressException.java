package b3;

import java.util.Scanner;

public class WebAdressException 
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap vao url:");
		String string = scanner.nextLine();
		
		if(string.contains("http"))
		{
			System.out.println("url  dung dinh dang:");
		}
		else  
		{
			System.out.println("url khong dung dinh dang");
		}
	}
}
