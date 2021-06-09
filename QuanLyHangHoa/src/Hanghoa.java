import java.util.Scanner;

public class Hanghoa {

	Scanner sc = new Scanner(System.in);
	private String maHang;
	private String tenHang;
	private String NSX;
	private int soLuong;
	
	public Hanghoa() {}
	public Hanghoa(String ma, String ten, String nsx, int soluong) {
		this.maHang=ma;
		this.tenHang=ten;
		this.NSX=nsx;
		this.soLuong=soluong;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getNSX() {
		return NSX;
	}
	public void setNSX(String nSX) {
		NSX = nSX;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public void input() {
		System.out.print("Nhap ma hang: ");
		this.maHang = sc.nextLine();
		System.out.print("Nhap ten hang: ");
		this.tenHang = sc.nextLine();
		System.out.print("Nhap nha san xuat: ");
		this.NSX = sc.nextLine();
		System.out.print("Nhap so luong: ");
		this.soLuong = sc.nextInt();
	}
	public void hienThi() {
		System.out.println(this.maHang+"\t\t"+this.tenHang+"\t\t"+this.NSX+"\t\t"+this.soLuong);
	}
}
