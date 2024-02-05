package org.example.question;

import org.example.DBINFO;

import java.sql.*;

public class QDB {

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;




    public void Q(int i) {


        try {
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.password);
            pstmt = con.prepareStatement("SELECT * FROM q where qn = "+i);
            rs = pstmt.executeQuery();
            while (rs.next()) {


                System.out.println(rs.getString("q"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                rs.close();
                con.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void AS(int i) {

        try {
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.password);
            pstmt = con.prepareStatement("SELECT * FROM `as` where qn = "+i);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("an"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                rs.close();
                con.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

