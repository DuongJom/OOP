import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static void nhapDS(List<Dia> a, int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin dia thu "+(i+1)+":");
			Dia d = new Dia();
			d.input();
			a.add(d);
		}
	}
	
	static void them1Dia(List<Dia> a) {
		Dia d = new Dia();
		d.input();
		a.add(d);
	}
	
	static void hienThiDS(List<Dia> a) {
		System.out.println("Ma\t\tTen\t\tThe loai\tNam phat hanh");
		for(Dia i: a) {
			i.hienThi();
		}
	}
	static void hienThiDiaPhatHanh18TroLai(List<Dia> a) {
		System.out.println("Ma\t\tTen\t\tThe loai\tNam phat hanh");
		for(Dia i: a) {
			if(i.getNamPhatHanh()>=2018) {
				i.hienThi();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dia> a = new ArrayList<Dia>();
		Scanner sc = new Scanner(System.in);
		System.out.println("====================NHAP DANH SACH DIA================");
		System.out.print("Nhap so luong dia: ");
		int n = sc.nextInt();
		nhapDS(a,n);
		System.out.println("==================THEM 1 DIA VAO DANH SACH===============");
		them1Dia(a);
		System.out.println("===============DANH SACH DIA DA NHAP==================");
		hienThiDS(a);
		System.out.println("===========DANH SACH DIA CO NAM PHAT HANH >=2018============");
		hienThiDiaPhatHanh18TroLai(a);
	}

}
