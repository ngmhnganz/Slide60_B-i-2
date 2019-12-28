package Lop1k.com;

import java.awt.RenderingHints.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main 
{
	static HashMap<Integer, String> dsSV = new HashMap<Integer, String>(){};
	static void Menu() 
	{
		System.out.println("Chọn chức năng bạn muốn.");
		System.out.println("1.Thêm Sinh viên.");
		System.out.println("2. Xuất danh sách sinh viên");
		System.out.println("3. Sửa sinh viên.");
		System.out.println("4. Xoá sinh viên chứa tên bất kỳ.");
		System.out.println("5. Tìm sinh viên mà tên cho chữ An.");
		System.out.println("6. Xuất ra các mã sinh viên (chỉ mã).");
		System.out.println("7. Xuất ra các tên sinh viên (chỉ tên)");
		int pick= new Scanner(System.in).nextInt();
		switch (pick) 
		{
		case 1:
			themSinhVien();
			break;
		case 2:
			xuatSinhVien();
			break;
		case 3:
			suaSinhVien();
			break;
		case 4:
			xoaSinhVien();
			break;
		case 5:
			timAn();
			break;
		case 6:
			xuatSinhVienMa();
			break;
		case 7: 
			xuatSinhVienTen();
			break;
		}
	}
	private static void xuatSinhVienTen()
	{
		
	}
	private static void xuatSinhVienMa() 
	{
		
	}
	private static void timAn() 
	{
		
	}
	private static void xoaSinhVien()
	{
		System.out.println("Đây là danh sách sinh viên.");
		dsSV.forEach((key, value) -> System.out.println(key + ". " + value));
		System.out.println("Mời bạn nhập vào Mã Sinh Viên bạn muốn xoá");
		int pick = new Scanner(System.in).nextInt();
		dsSV.remove(pick);
	}
	private static void suaSinhVien()
	{
		System.out.println("Đây là danh sách sinh viên.");
		dsSV.forEach((key, value) -> System.out.println(key + ". " + value));
		System.out.println("Mời bạn nhập vào Mã Sinh Viên bạn muốn sửa");
		int pick = new Scanner(System.in).nextInt();
		System.out.println("Mời nhập vào tên bạn muốn chuyển thành.");
		String ten = new Scanner(System.in).nextLine();
		dsSV.put(pick, ten);
		
	}	
	private static void xuatSinhVien() 
	{
		System.out.println("Danh sách sinh viên.");
		dsSV.forEach((key, value) -> System.out.println(key + ". " + value));
	}
	private static void themSinhVien() 
	{
		System.out.print("Mời bạn nhập mã sinh viên: ");
		int key = new Scanner(System.in).nextInt();
		System.out.println("Mời bạn nhập tên sinh viên: ");
		String value = new Scanner(System.in).nextLine();
		dsSV.put(key, value);
		System.out.println("Đã thêm.");
	}
	public static void main(String[] args)
	{
		do
		{
			Menu();
		}
		while (true);
	}
}
