package lab3;

import java.io.*;
import java.util.Scanner;

class User{
    String id;
    String name;
    String email;

    User(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

   String returnUser(){
        return id+" "+name+" "+email;
   }

}

public class Filetaken {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("user.txt",true)) {
           for ( int j =0;j<5;j++){
               System.out.println("Input " + (j+1)+ " User data");
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter id");

               String id = sc.nextLine();

               System.out.println("Enter name");

               String name = sc.nextLine();

               System.out.println("Enter email");

               String email = sc.nextLine();

               User user = new User(id,name,email);


               fw.write(user.returnUser()+"\n");
           }


        }catch (Exception e)
        {
            System.out.println(e);
        }


        try
        {
            FileReader fr = new FileReader("user.txt");
           int i ;
            System.out.println();
            System.out.println("Reading File....");
           while((i=fr.read()) !=-1){
               System.out.print((char) i);
           }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
