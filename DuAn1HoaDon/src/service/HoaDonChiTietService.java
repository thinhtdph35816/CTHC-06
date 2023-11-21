/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.HoaDonChiTiet;
/**
 *
 * @author Chien
 */
public class HoaDonChiTietService {
    public List<HoaDonChiTiet> getAll(){
        String sql = """
                     SELECT [Id]
                           ,[IdHoaDon]
                           ,[IdSanPhamChiTiet]
                           ,[SoLuong]
                           ,[GiaTien]
                       FROM [dbo].[HoaDonChiTiet]
                     """;
         try(Connection con = DBconnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonChiTiet> list = new ArrayList<>();
            while (rs.next()) {                
                HoaDonChiTiet hdct = new HoaDonChiTiet(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(hdct);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
