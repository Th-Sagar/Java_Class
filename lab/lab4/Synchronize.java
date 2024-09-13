package lab4;
class MySharedResource{
    synchronized void myResource(int number){

        for(int i=1;i<=10;i++){
            try
            {
                Thread.sleep(700);
                System.out.println(number*i);

            }

            catch (Exception e){
                System.out.println(e);
            }
        }

    }
}


class Mythread extends Thread{

    MySharedResource mySharedResource;

    Mythread(MySharedResource mySharedResource){
        this.mySharedResource = mySharedResource;
    }
    public  void run(){
        mySharedResource.myResource(5);


    }
}

class Mythread2 extends Thread{
    MySharedResource mySharedResource1;
    Mythread2(MySharedResource mySharedResource1){
        this.mySharedResource1 = mySharedResource1;
    }
   public void run(){
        mySharedResource1.myResource(2);

    }
}

public class Synchronize {
    public static void main(String[] args) {

        MySharedResource mySharedResource = new MySharedResource();

        Mythread mythread = new Mythread(mySharedResource);
        mythread.start();

        Mythread2  mythread2= new Mythread2(mySharedResource);
        mythread2.start();

    }
}
