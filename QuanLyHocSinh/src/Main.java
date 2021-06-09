import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static void themHocSinhVaoDS(List<Hocsinh> a) {
		Hocsinh hs = new Hocsinh();
		hs.input();
		a.add(hs);
	}
	
	static void nhapDS(List<Hocsinh> a, int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin hoc sinh thu "+(i+1)+":");
			Hocsinh hs = new Hocsinh();
			hs.input();
			a.add(hs);
		}
		
	}
	
	static void hienThiDS(List<Hocsinh> a) {
		System.out.println("    Ho ten\t    Tuoi     Que quan      Lop");
		for(Hocsinh i : a) {
			i.display();
		}
	}
	
	static void hienThiHSTren14Tuoi(List<Hocsinh> a) {
		System.out.println("    Ho ten\t    Tuoi     Que quan      Lop");
		for(Hocsinh i: a) {
			if(i.getAge()>=14) {
				i.display();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Hocsinh> a = new ArrayList<Hocsinh>();
		
		System.out.print("Nhap so luong hoc sinh: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println("================NHAP DANH SACH HOC SINH================");
		nhapDS(a,n);
		System.out.println("==============THEM HOC SINH MOI VAO DANH SACH==========");
		themHocSinhVaoDS(a);
		System.out.println("===================HIEN THI DANH SACH==================");
		hienThiDS(a);
		System.out.println("===============DANH SACH HOC SINH TREN 14 TUOI=============");
		hienThiHSTren14Tuoi(a);
	}

}
