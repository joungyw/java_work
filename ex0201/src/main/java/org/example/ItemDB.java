package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDB {

    private String dburl = "jdbc:mysql://192.168.0.38/PMH";
    private String dbuser = "JYW";
    private String dbPassword = "1234";



    public List<Item> findAll(){
        List<Item> list = new ArrayList<>();

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(dburl,dbuser,dbPassword);
            pstmt = con.prepareStatement("select * from item");
            rs = pstmt.executeQuery();
            while (rs.next()){
                Item item1 = new Item();
                item1.setItem_nm(rs.getString("item_nm"));
                item1.setPrice(rs.getInt("price"));
                item1.setItem_id(rs.getLong("Item_id"));
                item1.setReg_time(rs.getString("Reg_time"));
                item1.setItem_detail(rs.getString("Item_detail"));
                item1.setItem_sell_status(rs.getString("Item_sell_status"));

                list.add(item1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        return  list;


    }

}
