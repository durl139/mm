      Jdbc con = new Jdbc();
        WebSites ws = con.getDBcon();
        jTextField1.setText(ws.getId());
        jTextField2.setText(ws.getName());
        jTextField3.setText(ws.getUrl());
        System.out.println("over!");
		
		package javadatabasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Jdbc {

//    多态
    Connection conn = null;
    Statement stmt = null;
//    sql文をデータベースに送るためのインターフェース
    ResultSet rset = null;

    String DB_URL = "jdbc:postgresql://localhost:5432/HE";
    String USER = "postgres";
    String PASS = "postgres";

    public WebSites getDBcon() {
        WebSites ws = new WebSites();
        try {
            Class.forName("org.postgresql.Driver");
            // PostgreSQLへ接続
            conn = DriverManager.getConnection(this.DB_URL, this.USER, this.PASS);
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO Websites (Id,Name,Url,alexa,country)\n"
                    + "VALUES (8,'Google','https://www.google.cm/',1,'China');";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            // TODO
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ws;
    }

//    public void closeDBcon() throws SQLException {
//        if (conn != null) {
//
//            stmt.close();
//            conn.close();
//        }
//    }
//    public int addShopinfo(Shop sp) throws SQLException {
////sql文を生成
//        String sql = "INSERT INTO Shopinfo (id,name,tel,address) ";
//        sql += "VALUES ( " + sp.getId() + ",";
//        sql += "'" + sp.getName() + "',";
//        sql += "'" + sp.getTel() + "',";
//        sql += "'" + sp.getAddress() + "')";
//        System.out.println(sql);
////executeUpdate　DML文を実行するためのメソッド
//        stmt.executeUpdate(sql);
//        return 1;
//    }
}
