import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static void nhapDS(List<Hanghoa> a, int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin mat hang thu "+(i+1)+":");
			Hanghoa d = new Hanghoa();
			d.input();
			a.add(d);
		}
	}
	
	static void them1HangHoa(List<Hanghoa> a) {
		Hanghoa d = new Hanghoa();
		d.input();
		a.add(d);
	}
	
	static void hienThiDS(List<Hanghoa> a) {
		System.out.println("Ma\t\tTen\t\tNSX\t\tSo luong");
		for(Hanghoa i: a) {
			i.hienThi();
		}
	}
	static void hienThiHangHoaSoLuong200TroLen(List<Hanghoa> a) {
		System.out.println("Ma\t\tTen\t\tNSX\t\tSo luong");
		for(Hanghoa i: a) {
			if(i.getSoLuong()>=200) {
				i.hienThi();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Hanghoa> a = new ArrayList<Hanghoa>();
		Scanner sc = new Scanner(System.in);
		System.out.println("====================NHAP DANH SACH HANG HOA================");
		System.out.print("Nhap so luong hang hoa: ");
		int n = sc.nextInt();
		nhapDS(a,n);
		System.out.println("==================THEM 1 HANG HOA VAO DANH SACH===============");
		them1HangHoa(a);
		System.out.println("===============DANH SACH HANG HOA DA NHAP==================");
		hienThiDS(a);
		System.out.println("===========DANH SACH HANG HOA CO SO LUONG >=200============");
		hienThiHangHoaSoLuong200TroLen(a);
	}

}