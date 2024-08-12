import java.util.ArrayList;
import java.util.List;

public class QLGV {
    private List<GiaoVien> giaoViens;

    public QLGV() {
        giaoViens = new ArrayList<GiaoVien>();
    }

    public void addGiaoVien(GiaoVien giaoVien) {
        giaoViens.add(giaoVien);
    }

    public void showGiaoViens() {
        this.giaoViens.forEach(giaoVien -> System.out.println(giaoVien.toString()));
    }

    public void removeGiaoVien(String id) {
        giaoViens.removeIf(giaoVien -> giaoVien.getId().equals(id));
    }

    public int tinhLuong(String id) {
        GiaoVien giaoVien = this.giaoViens.stream().filter(g -> g.getId().equals(id)).findFirst().orElse(null);
        if (giaoVien == null) {
            return 0;
        } else {
            return (giaoVien.getLuongcung() + giaoVien.getLuongthuong() - giaoVien.getLuongphat());
        }
    }
}
