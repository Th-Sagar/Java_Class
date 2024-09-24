package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatement {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/trinity";
            String query ="UPDATE student set address= ? where address= ?";
            Connection conn = DriverManager.getConnection(url,"root","1234567890");
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1,"kathmandu");
            stmt.setString(2,"ktm");

           int i = stmt.executeUpdate();
            System.out.println("Change in rows "+ i);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
