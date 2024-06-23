public class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("task 1 Started ");

        for (int i =1; i <=100 ; i++) {
            System.out.print(" "+i);
        }
        System.out.println("\n task 1 ended ");

    }
}
