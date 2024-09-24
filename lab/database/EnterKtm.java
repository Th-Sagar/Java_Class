package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EnterKtm {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/trinity";
            String query ="UPDATE student set address='kathmandu' where address='chitwan'";
            Connection con = DriverManager.getConnection(url,"root","1234567890");
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate(query);

            System.out.println("Change rows"+i);
            con.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
