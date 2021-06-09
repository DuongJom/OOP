import java.util.Scanner;

public class Sach {

	//Khởi tạo Scanner để nhận input từ người dùng 
	Scanner sc = new Scanner(System.in);
	
	//Khai báo các thuộc tính của đầu sách
	private String maSach;
	private String tenSach;
	private String NXB;
	private int soLuong;
	
	//Hàm tạo không tham số
	public Sach() {}
	
	//Hàm tạo có tham số
	public Sach(String ma, String ten, String nxb, int soluong) {
		this.maSach = ma;
		this.tenSach = ten;
		this.NXB = nxb;
		this.soLuong = soluong;
	}

	//Hàm getter: trả về mã sách
	public String getMaSach() {
		return maSach;
	}

	//Hàm setter: gán giá trị cho thuộc tính maSach của đối tượng bằng tham số maSach truyền vào
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	//Hàm getter: trả về tên sách
	public String getTenSach() {
		return tenSach;
	}

	//Hàm setter: gán giá trị cho thuộc tính tenSach của đối tượng bằng tham số tenSach truyền vào
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	//Hàm getter: trả về tên nhà xuất bản
	public String getNXB() {
		return NXB;
	}

	//Hàm setter: gán giá trị cho thuộc tính NXB của đối tượng bằng tham số nXB truyền vào
	public void setNXB(String nXB) {
		NXB = nXB;
	}

	//Hàm getter: trả về số lượng ứng với mỗi đầu sách
	public int getSoLuong() {
		return soLuong;
	}

	//Hàm setter: gán giá trị cho thuộc tính soLuong của đối tượng bằng tham số soLuong truyền vào
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	//Hàm nhập thông tin sách gồm mã sách, tên sách, nhà xuất bản và số lượng
	public void input() {
		System.out.print("\tNhap ma sach: "); 	//Hiển thị câu nhắc "Nhap ma sach:" lên màn hình
		this.maSach = sc.nextLine();			//Chờ người dùng nhập thông tin từ bàn phím vào 1 chuỗi kí tự
		System.out.print("\tNhap ten sach: ");	//Hiển thị câu nhắc "Nhap ten sach:" lên màn hình
		this.tenSach = sc.nextLine();			//Chờ người dùng nhập thông tin từ bàn phím vào 1 chuỗi kí tự
		System.out.print("\tNhap NXB: ");			//Hiển thị câu nhắc "Nhap NXB:" lên màn hình
		this.NXB = sc.nextLine();				//Chờ người dùng nhập thông tin từ bàn phím vào 1 chuỗi kí tự
		System.out.print("\tNhap so luong: ");	//Hiển thị câu nhắc "Nhap so luong:" lên màn hình
		this.soLuong = sc.nextInt();			//Chờ người dùng nhập thông tin từ bàn phím vào 1 số nguyên
	}
	
	//Hàm hiển thị thông tin đầu sách ra màn hình, mỗi giá trị khi in ra sẽ cách nhau 1 phím tab
	public void hienThi() {
		System.out.println(this.maSach+"\t\t"+this.tenSach+"\t\t"+this.NXB+"\t\t"+this.soLuong);
	}
}
