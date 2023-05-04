package ngay2;

import ngay2.HinhChuNhat;

public class Main2 {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        System.out.println("Chu vi: "+ hcn1.chuVi());
        hcn1.setChieuDai(2);
        System.out.println("Chu vi: "+ hcn1.chuVi());

    }
}