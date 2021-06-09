import java.util.Scanner;

public class Hocsinh {

	Scanner sc = new Scanner(System.in);
	
	//Khai báo các thuộc tính
	private String hoTen;
	private int age;
	private String queQuan;
	private String lop;
	
	//Hàm khởi tạo không tham số
	public Hocsinh() {}
	//Hàm khởi tạo có tham số
	public Hocsinh(String ten, int age, String queQuan, String lop) {
		this.hoTen=ten;
		this.age=age;
		this.queQuan=queQuan;
		this.lop=lop;
	}
	
	//Hàm getter và setter của từng thuộc tính
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	//Hàm nhập thông tin mỗi học sinh
	public void input() {
		System.out.print("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		this.age=sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap que quan: ");
		this.queQuan = sc.nextLine();
		System.out.print("Nhap lop: ");
		this.lop=sc.nextLine();
		//sc.nextLine();
	}
	public void display() {
		System.out.printf("%17s%6d%15s%10s\n",this.hoTen,this.age,this.queQuan,this.lop);
	}
}
