import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	//Hàm thêm 1 đầu sách vào danh sách hiện có, danh sách ở đây là kiểu List<Sach> a
	static void them1DauSach(List<Sach> a) {
		Sach s = new Sach();		//Khởi tạo 1 đối tượng sách
		s.input();					//Thực hiện gọi hàm input() của đối tượng s để nhập thông tin đầu sách
		a.add(s);					//Thêm s vào danh sách hiện có
	}
	
	//Hàm nhập vào 1 danh sách có n phần tử
	static void nhapDS(List<Sach> a, int n) {
		for(int i=0;i<n;i++) {		//Vòng lặp duyệt qua n phần tử
			System.out.println("Nhap thong tin dau sach thu "+(i+1)+":");
			Sach s = new Sach();	//Khởi tạo 1 đối tượng sách
			s.input();				//Thực hiện gọi hàm input() của đối tượng s để nhập thông tin đầu sách
			a.add(s);				//Thêm s vào danh sách
		}
	}
	
	//Hàm hiển thị danh sách đã thêm mới
	static void hienThiDSThemMoi(List<Sach> a) {
		System.out.println("Ma sach\t\tTen sach\t\tNXB\t\tSo luong");
		//Duyệt qua mọi phần tử trong danh sách đầu sách đã được thêm mới
		for(Sach i: a) {
			i.hienThi();//Hiển thị thông tin từng đầu sách bằng cách gọi hàm hienThi()
		}
	}
	
	//Hàm hiển thị đầu sách có số lượng >=10
	static void hienThiDauSachLonHon10(List<Sach> a) {
		//Khai báo 1 biến kiểm tra có đầu sách nào có số lượng >=10 không
		int dem=0;
		System.out.println("Ma sach\t\tTen sach\t\tNXB\t\tSo luong");
		//Duyệt qua tất cả phần tử trong danh sách
		for(Sach i: a) {
			//Kiểm tra số lượng >=10, nếu thỏa thì in thông tin đầu sách ra màn hình
			if(i.getSoLuong()>=10) {
				i.hienThi();
			}
			else {
				//Nếu đầu sách hiện tại không thỏa điều kiện thì tăng biến dem lên 1 đơn vị
				dem++;
			}
		}
		//Kiểm tra biến dem, nếu dem bằng số phần tử của danh sách thì in thông báo "Không có đầu sách thỏa điều kiện"
		if(dem==a.size()) {
			System.out.println("Khong co dau sach có so luong >=10 trong danh sach!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong dau sach: ");		//Hiển thị câu thông báo ra màn hình
		int n = sc.nextInt();								//Chờ người dùng nhập vào 1 số nguyên cho số lượng đầu sách sẽ chứa trong danh sách
		
		//Khởi tạo 1 danh sách chứa các đầu sách
		List<Sach> danhSach = new ArrayList<>();
		
		System.out.println("=================NHAP DANH SACH================");
		//Thực hiện nhập danh sách
		nhapDS(danhSach,n);
		System.out.println("==============THEM MOI 1 DAU SACH==============");
		//Thực hiện thêm mới 1 đầu sách
		them1DauSach(danhSach);
		System.out.println("===============HIEN THI DANH SACH DUOC THEM MOI===============");
		//Thực hiện hiển thị danh sách các đầu sách được thêm mới
		hienThiDSThemMoi(danhSach);
		System.out.println("===============DAU SACH CO SO LUONG >= 10================");
		//Thực hiện hiển thị danh sách các đầu sách có số lượng >=10
		hienThiDauSachLonHon10(danhSach);
		
	}

}
