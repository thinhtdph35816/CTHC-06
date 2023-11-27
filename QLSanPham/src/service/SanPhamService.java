/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SanPham;



/**
 *
 * @author nguyen cuong
 */
public class SanPhamService {
    private Connection conn;
    public SanPhamService(){
        try {
            this.conn = DBConnection.getConnection();
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public ArrayList<SanPham> findAll() {
        String querry = "select * from SanPham";
        ArrayList<SanPham> sp = new ArrayList<>();
        try {
            PreparedStatement pr = conn.prepareStatement(querry);
            pr.execute();
            ResultSet rs = pr.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ma = rs.getString("ma");
                String ngayTao = rs.getString("NgayTao");
                String ngaySua = rs.getString("NgaySua");
                String trangThai = rs.getString("TrangThai");
                SanPham sanpham = new SanPham(id, ma, ngayTao, ngaySua, trangThai);
                sp.add(sanpham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
    }
      public Boolean add(SanPham sp) {
        Integer row = null;
        try {
            String sql = "insert into SanPham(ma,NgayTao,NgaySua,TrangThai) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMa());
           ps.setString(2, sp.getNgayTao());
           ps.setString(3, sp.getNgaySua());
            ps.setString(4, sp.getTrangThai());
            
            ps.execute();
            row = ps.getUpdateCount();
            System.out.println(row);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row > 0;
    }
      public boolean update(SanPham sp , String ma){
          Integer row = null;
          try {
            String sql = "update SanPham set ma = ?,NgayTao=?,NgaySua=?,TrangThai=? where ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMa());
           ps.setString(2, sp.getNgayTao());
           ps.setString(3, sp.getNgaySua());
            ps.setString(4, sp.getTrangThai());
            
            ps.execute();
            row = ps.getUpdateCount();
            System.out.println(row);
        } catch (Exception e) {
            e.printStackTrace();
        }
          return row > 0;
      }
    public Boolean xoaDanhSach(int id) {
        Integer row = null;
        try {
            String sql = "delete from SanPham where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            row = ps.getUpdateCount();
            System.out.println(row);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row > 0;
    }
}

