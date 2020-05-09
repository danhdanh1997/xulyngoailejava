package b2;

import java.util.Scanner;

@SuppressWarnings("serial")
public class UnsignedIntergerException  extends Exception
{
	public UnsignedIntergerException(String s)
	{
		super(s);
	}
	
	static private String posInteger(String input) throws UnsignedIntergerException 
    {
        if (Integer.valueOf(input) > 0)
            {
                return input;
            }
        else 
            {
                throw new UnsignedIntergerException("Error, number can't be negative.");
            }
    }
	
	public static void main(String[] args) throws UnsignedIntergerException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao chuoi");
		String input = String.valueOf(scanner.nextLine());
		posInteger(input);
		System.out.println("gia tri chuoi nhap vao la:"+input);
	}
}






















