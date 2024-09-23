package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306";
            String query = "SELECT * from student";
            Connection conn = DriverManager.getConnection(url,"root","password");
            Statement stmt = conn.createStatement();
//            ResultSet resultSet = stmt.executeQuery(query);
//            while(resultSet.next()){
//                System.out.println(resultSet.getInt("id") + ""+ resultSet.getString("name")+""+resultSet.getString("address"));
//            }
//            conn.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
