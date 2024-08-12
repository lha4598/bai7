import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLGV quanly = new QLGV();
        while (true) {
            System.out.println("--------MENU------");
            System.out.println("1. Thêm giáo viên");
            System.out.println("2. Hiển thị thông tin tất cả các giáo viên");
            System.out.println("3. Xóa giáo viên theo ID");
            System.out.println("4. Tính lương cho giáo viên theo ID");
            System.out.println("5. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    GiaoVien giaoVien = new GiaoVien();
                    giaoVien.Nhap();
                    quanly.addGiaoVien(giaoVien);
                    break;
                }
                case 2: {
                    quanly.showGiaoViens();
                    break;
                }
                case 3: {
                    System.out.println("Nhập id giáo viên cần xóa");
                    String id = sc.nextLine();
                    quanly.removeGiaoVien(id);
                    break;
                }
                case 4: {
                    System.out.println("Nhập id giáo viên cần tính lương");
                    String id = sc.nextLine();
                    System.out.println(quanly.tinhLuong(id));
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}