/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizkymom.s;
import java.sql.*;
public class KONEKSI {
  static final String DRIVER = "com.mysql.jdbc.Driver";
  static final String URL = "jdbc : mysql ://localhost/penjualan_barang";
  static final String USER = "root";
  static final String UPASS = "";
  static Connection conn;
  static Statement stat;
          public static  void konek(){
              try{
              Class.forName(DRIVER);
              conn = DriverManager.getConnection(URL, USER, UPASS);
                  System.out.println("koneksi berhasil");
          }catch (Exception e){
    System.out.println("koneksi berhasil");
          }
          }
public static void main (String[] args){
    konek();
}
}
