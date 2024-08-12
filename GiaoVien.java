import java.util.Scanner;

public class GiaoVien {
    private String ten, que;
    private  int tuoi;
    private String id;
    private int luongcung, luongthuong, luongphat;

    public GiaoVien() {

    }

    public GiaoVien(String ten, String que, int tuoi, String id, int luongcung, int luongthuong, int luongphat) {
        this.ten = ten;
        this.que = que;
        this.tuoi = tuoi;
        this.id = id;
        this.luongcung = luongcung;
        this.luongthuong = luongthuong;
        this.luongphat = luongphat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public int getLuongthuong() {
        return luongthuong;
    }

    public void setLuongthuong(int luongthuong) {
        this.luongthuong = luongthuong;
    }

    public int getLuongphat() {
        return luongphat;
    }

    public void setLuongphat(int luongphat) {
        this.luongphat = luongphat;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập quê quán: ");
        que = sc.nextLine();
        System.out.println("Nhập ID: ");
        id = sc.nextLine();
        System.out.println("Nhập lương cứng: ");
        luongcung = sc.nextInt();
        System.out.println("Nhập lương thưởng: ");
        luongthuong = sc.nextInt();
        System.out.println("Nhập lương phạt");
        luongphat = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "[Giáo viên " + ten +", Tuổi: " + tuoi + ", Quê quán: " + que + ", ID: " + id +
                ", LC: " + luongcung +", LT" + luongthuong+", LP: " + luongphat + "]";
    }
}
