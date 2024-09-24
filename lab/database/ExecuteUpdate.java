package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/trinity";
            String query = "INSERT into student values('3','demo','demo')";
            Connection conn = DriverManager.getConnection(url,"root","1234567890");
            Statement stmt = conn.createStatement();
            int i = stmt.executeUpdate(query);
            System.out.println(i);

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
