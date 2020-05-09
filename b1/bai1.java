package b1.demo;

import java.util.InputMismatchException;
import java.util.Scanner;



//Viết chương trình cho phép người dùng nhập vào chuỗi số
//nguyên từ bàn phím, sau đó chuyển chuỗi nhận được sang số
//nguyên. Trong trường hợp chuỗi nhập vào không đúng định dạng
//(số), chương trình không thể chuyển sang dạng số thì hiển thị
//thông báo lỗi bằng việc dùng quản lý biệt lệ.


public class bai1
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap gia tri cua chuoi:");
		String nString = null;
		try 
		{
			nString = String.valueOf(scanner.nextInt());
		}
		catch (InputMismatchException e)
		{
			System.out.println("khoi lenh trong catch");
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("gia tri la:"+nString);
		}
		
	}
}













