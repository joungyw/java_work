package org.example.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CartDB {
    private CartCLI cartCLI = new CartCLI();
    public void insert() {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
