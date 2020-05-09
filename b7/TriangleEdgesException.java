package b7;

import java.util.Scanner;

public class TriangleEdgesException extends Exception
{
	public TriangleEdgesException(String string) 
	{
		super(string);
	}
	
	static private void kiemtratamgiac(int a, int b, int c) throws TriangleEdgesException
	{
		if(a <=0 && b<=0 && c<=0 && a+b<=c && b+c<=a && c+a <=b )
		{
			throw new TriangleEdgesException("tam giac khong hop le:");
		}
		else 
		{
			System.out.println("tam giac hop le:");
		}
	}
	
	public static void main(String[] args) throws TriangleEdgesException 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap vao 3 canh cua tam giac:");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		kiemtratamgiac(a, b, c);
	}
}























