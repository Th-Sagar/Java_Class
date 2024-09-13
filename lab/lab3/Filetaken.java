package lab3;

import java.io.*;
import java.util.Scanner;

class User implements Serializable{
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


        try(FileOutputStream fw = new FileOutputStream("user.txt",true)) {
            ObjectOutputStream oos = new ObjectOutputStream(fw);
           for ( int j =1;j<=5;j++){
               System.out.println("Input " + " User data");
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter id");

               String id = sc.nextLine();

               System.out.println("Enter name");

               String name = sc.nextLine();

               System.out.println("Enter email");

               String email = sc.nextLine();

               User user = new User(id,name,email);
               oos.writeObject(user);


           }


        }catch (Exception e)
        {
            System.out.println(e);
        }


        try(FileInputStream fis = new FileInputStream("user.txt")){

            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("User are");
            for(int j=1; j<=5;j++){
                User user1 = (User) ois.readObject();
                System.out.println("Id : "+ user1.id + " Name : "+ user1.name + " Email : "+ user1.email);
            }



        }
        catch (Exception e){
            System.out.println(e);
        }




    }
}
