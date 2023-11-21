/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Chien
 */
public class HoaDonChiTiet {
    private String id;
    private String idHoaDon;
    private String idSanPhamChiTiet;
    private String soLuong;
    private String giaTien;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String id, String idHoaDon, String idSanPhamChiTiet, String soLuong, String giaTien) {
        this.id = id;
        this.idHoaDon = idHoaDon;
        this.idSanPhamChiTiet = idSanPhamChiTiet;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdSanPhamChiTiet() {
        return idSanPhamChiTiet;
    }

    public void setIdSanPhamChiTiet(String idSanPhamChiTiet) {
        this.idSanPhamChiTiet = idSanPhamChiTiet;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "id=" + id + ", idHoaDon=" + idHoaDon + ", idSanPhamChiTiet=" + idSanPhamChiTiet + ", soLuong=" + soLuong + ", giaTien=" + giaTien + '}';
    }
    
    
}
