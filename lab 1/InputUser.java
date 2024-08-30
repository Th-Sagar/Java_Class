import java.util.*;

public class InputUser{
	public static void main(String[] args){
		System.out.println("Enter name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Name :" + name.toUpperCase());
	}
	
}