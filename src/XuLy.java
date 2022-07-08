import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);	
      float tong = calculionSumNoNegativeWayTwo(scan);
      System.out.println(tong);
	}

	public static float calculionSumNoNegativeWayFirsy(Scanner scan) {
		float tong = 0; //tạo biến tích lũy ngoài vòng lặp
		int nhap =3;
		while(nhap > 0) {
			System.out.println("Hãy nhập vào số >= 0. Nhập <= 0 để dừng");
			nhap = Integer.parseInt(scan.nextLine());
			if(nhap > 0) {
				tong += nhap;
			}
		}
		return tong;
	}
	
	public static float calculionSumNoNegativeWayTwo(Scanner scan) {
		float tong = 0;
		boolean flag = true;
		while(flag) {
			System.out.println("Hãy nhập vào số >= 0. Nhập <= 0 để dừng");
			int nhap = Integer.parseInt(scan.nextLine());
			if(nhap > 0) {
				tong += nhap;
			} else {
				flag = false;
			}
		}
		
		return tong;
	}
}
