package lab2.MyException;

//class MyException extends Exception {
//    public MyException() {
//        super("Custom Exception Occurred");
//    }
//
//    public MyException(String message) {
//        super(message);
//    }
//}

class InvalidMarkException extends RuntimeException {


    public InvalidMarkException(String message) {
        super(message);
    }
}

public class Excep {
    public static void main(String[] args) {
//        try {
//            throw new MyException("This is my custom checked exception message.");
//        } catch (MyException e) {
//            System.out.println("Caught Exception: " + e.getMessage());
//        }

        try {
            throw new InvalidMarkException("This is my custom runtime exception message.");
        } catch (InvalidMarkException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
