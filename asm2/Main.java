package main.asm2;

public class Main {
    public static void main(String[] args){
        // Test SinhVien
        System.out.println("=== SINH VIEN ===");
        Sinhvien sv = new Sinhvien("SV01", "Nguyen Van A", 20, 8.2);
        sv.inThongTin();

        // Test TaiKhoan
        System.out.println("\n=== TAI KHOAN ===");
        TaiKhoan tk = new TaiKhoan("123456", "Nguyen Van B", 5000.0);
        tk.napTien(2000);
        tk.rutTien(10000);
        tk.rutTien(3000);
        tk.hienthiSoDu();

        // Test HocSinh
        System.out.println("\n=== HOC SINH ===");
        HocSinh hs = new HocSinh("Tran Thi C", 9, 7.5, 8.0);
        System.out.println("Diem TB: " + hs.tinhDiemTB());
        System.out.println("Xep loai: " + hs.xepLoai());
    }
}
