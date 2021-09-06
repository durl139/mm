/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.dcnet.www.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.dcnet.www.object.Book;

/**
 *
 * @author user
 */
public class DbConn {

    Connection conn = null;
    Statement stmt = null;
//    sql文をデータベースに送るためのインターフェース
    ResultSet rset = null;

    String DB_URL = "jdbc:postgresql://localhost:5432/HE";
    String USER = "postgres";
    String PASS = "postgres";

    /**
     * CONN
     */
    public void getDBcon() {
        try {
            Class.forName("org.postgresql.Driver");
            // PostgreSQLへ接続
            conn = DriverManager.getConnection(this.DB_URL, this.USER, this.PASS);
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();

        } catch (SQLException e) {
            // TODO
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Close
     */
    public void closeDb() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @return
     */
    public List<Book> findBook() {

        //sql文を生成
        String sql = "SELECT * FROM bookinfo";
        List<Book> list = new ArrayList<>();

        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String lang = rs.getString("lang");
                int inventory = rs.getInt("inventory");
                Book bk = new Book();
                bk.setId(id);
                bk.setName(name);
                bk.setLang(lang);
                bk.setInventory(inventory);
//                System.out.println(bk.toString());
                list.add(bk);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void UpdateBookInfo(Book com) throws SQLException {
        String sql = "update bookinfo set";
        sql += " lang=" + "'" + com.getLang() + "',";
        sql += "name=" + "'" + com.getName() + "',";
        sql += "inventory=" + "" + com.getInventory() + "";
        sql += " where id=";
        sql += "" + com.getId() + "";
        System.out.println(sql);
        stmt.executeUpdate(sql);
    }

    public List<Book> selectUserinfo() throws SQLException {
        List<Book> list = new ArrayList<>();
        String sql = "select * from bookinfo";

        ResultSet rs = stmt.executeQuery(sql);
        if (rs != null) {
            while (rs.next()) {

                Book com = new Book();
                com.setId(rs.getInt(1));
                com.setLang(rs.getString(2));
                com.setName(rs.getString(3));
                com.setEmail(rs.getString(4));
                list.add(com);
            }
        }
        return list;

    }

    public void deleteBook(int id) throws SQLException {
        String sql = "delete from bookinfo where id =" + id;
        System.out.println(sql);
        stmt.executeUpdate(sql);

    }

    public List<Book> WhereBook(String name) throws SQLException {
        String sql = "select * from bookinfo where name like '%" + name + "%'";
        List<Book> list = new ArrayList<>();
        System.out.println(sql);
        //stmt.executeUpdate(sql);
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                int id = rs.getInt("id");
                String lang = rs.getString("lang");
                int inventory = rs.getInt("inventory");
                Book bk = new Book();
                bk.setId(id);
                bk.setName(name);
                bk.setLang(lang);
                bk.setInventory(inventory);
                System.out.println(bk.toString());
                list.add(bk);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int userinfoId(int res) throws SQLException {
        String sql = "select * from userinfo where id = " + res;
        System.out.println(sql);
        ResultSet rs = stmt.executeQuery(sql);
        int result = 0;
        if (rs != null) {
            while (rs.next()) {
                return result = 1;
            }
        }
        return 0;
    }

    /**
     * 図書登録
     */
    public int addBook(Book bk) {

        //sql文を生成
        String sql = "INSERT INTO bookinfo (name,lang,inventory) VALUES (";

        sql += "'" + bk.getName() + "',";
        sql += "'" + bk.getLang() + "',";
        sql += "" + bk.getInventory() + ")";
        System.out.println(sql);
        try {
            //executeUpdate　DML文を実行するためのメソッド
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
}
