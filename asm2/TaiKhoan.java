package main.asm2;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private Double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTK, Double soDu){
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0){
            soDu += soTien;
        }else {
            System.out.println("So tien nap phai lon hon 0");
        }
    }

    public void rutTien(double soTien) {
        if (soTien <=0) {
            System.out.println("So tien rut phai lon hon 0");
        }else if (soTien > soDu) {
            System.out.println("So Du khong du");
        }else {
            soDu -= soTien;
        }
    }

    public void hienthiSoDu() {
        System.out.println("So du hien tai: "+ soDu);
    }
}
