import java.util.Scanner;

public class Dia {

	Scanner sc = new Scanner(System.in);
	
	private String maDia;
	private String tenDia;
	private String theLoai;
	private int namPhatHanh;
	
	public Dia() {}
	public Dia(String ma, String ten, String theLoai, int nam) {
		this.maDia=ma;
		this.tenDia=ten;
		this.theLoai=theLoai;
		this.namPhatHanh=nam;
	}
	public String getMaDia() {
		return maDia;
	}
	public void setMaDia(String maDia) {
		this.maDia = maDia;
	}
	public String getTenDia() {
		return tenDia;
	}
	public void setTenDia(String tenDia) {
		this.tenDia = tenDia;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public int getNamPhatHanh() {
		return namPhatHanh;
	}
	public void setNamPhatHanh(int namPhatHanh) {
		this.namPhatHanh = namPhatHanh;
	}
	
	public void input() {
		System.out.print("Nhap ma dia: ");
		this.maDia = sc.nextLine();
		System.out.print("Nhap ten dia: ");
		this.tenDia = sc.nextLine();
		System.out.print("Nhap the loai: ");
		this.theLoai = sc.nextLine();
		System.out.print("Nhap nam phat hanh: ");
		this.namPhatHanh = sc.nextInt();
	}
	
	public void hienThi() {
		System.out.println(this.maDia+"\t\t"+this.tenDia+"\t\t"+this.theLoai+"\t\t"+this.namPhatHanh);
	}
}
