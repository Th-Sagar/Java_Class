package lab1;

class OddThread implements Runnable {
    public void run() {
     for(int i=0;i<100;i=i+1){
         try{
             Thread.sleep(500);
             System.out.println(Thread.currentThread().getName());

         }catch (Exception e){
             System.out.println("Error");
         }
     }
    }
}


class evenThread implements Runnable {
    public void run() {
       for(int i=0; i<100;i=i+2){
           try{
               Thread.sleep(5000);
               System.out.println(Thread.currentThread().getName());

           }catch (Exception e){
               System.out.println("Error");
           }
       }
    }
}




public class ThreadDemo{
        public static  void main(String[] args){

            OddThread myThread = new OddThread();
            evenThread myThread1 = new evenThread();

            Thread thread = new Thread(myThread);
            Thread thread1 = new Thread(myThread1);
            thread.start();
            thread1.start();

        }

}
