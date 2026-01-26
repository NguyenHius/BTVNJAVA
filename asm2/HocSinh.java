package main.asm2;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    // Setter có ràng buộc
    public void setDiemToan(double diem) {
        if (diem >= 0 && diem <= 10)
            this.diemToan = diem;
    }

    public void setDiemVan(double diem) {
        if (diem >= 0 && diem <= 10)
            this.diemVan = diem;
    }

    public void setDiemAnh(double diem) {
        if (diem >= 0 && diem <= 10)
            this.diemAnh = diem;
    }

    // Tính điểm trung bình
    public double tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    // Xếp loại
    public String xepLoai() {
        double tb = tinhDiemTB();
        if (tb >= 8) return "Gioi";
        else if (tb >= 6.5) return "Kha";
        else if (tb >= 5) return "Trung binh";
        else return "Yeu";
    }
}
