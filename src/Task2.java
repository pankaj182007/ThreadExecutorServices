public class Task2 implements Runnable{
    @Override
       public void run() {

        System.out.println("task 2 Started ");

        for (int i =100; i <=200 ; i++) {
            System.out.print(" "+i);
        }
        System.out.println("\n task 2 ended ");

    }
}
