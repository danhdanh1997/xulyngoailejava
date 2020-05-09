package b4;

import java.util.Scanner;

public class AgeException  extends Exception
{
	public AgeException()
	{
		super();
	}
	
	public AgeException(String string) {
		super(string);
	}

	static private int kiemtratuoi(int tuoi) throws AgeException
	{
		if(tuoi > 0)
		{
			System.out.println("tuoi hop le:");
			return tuoi;
		}
		else
		{
			throw new AgeException("tuoi khong duoc <= 0");
		}
	}
	
	public static void main(String[] args) throws AgeException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap tuoi:");
		int tuoi = scanner.nextInt();
		kiemtratuoi(tuoi);
	}
}













