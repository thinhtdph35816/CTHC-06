/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Chien
 */
public class HoaDon {
    private Integer id;
    private String idNhanVien;
    private String idKhachHang;
    private String diaChi;
    private String tongTien;
    private String ngayXacNhan;
    private String ngayDat;

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", idNhanVien=" + idNhanVien + ", idKhachHang=" + idKhachHang + ", diaChi=" + diaChi + ", tongTien=" + tongTien + ", ngayXacNhan=" + ngayXacNhan + ", ngayDat=" + ngayDat + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayXacNhan() {
        return ngayXacNhan;
    }

    public void setNgayXacNhan(String ngayXacNhan) {
        this.ngayXacNhan = ngayXacNhan;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    public HoaDon(Integer id, String idNhanVien, String idKhachHang, String diaChi, String tongTien, String ngayXacNhan, String ngayDat) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.idKhachHang = idKhachHang;
        this.diaChi = diaChi;
        this.tongTien = tongTien;
        this.ngayXacNhan = ngayXacNhan;
        this.ngayDat = ngayDat;
    }

    public HoaDon() {
    }

   
}
