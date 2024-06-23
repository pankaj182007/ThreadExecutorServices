public class Task extends Thread{

    private int i;

    public Task(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("task "+ i +" Started ");

        for (int i =1; i <=100 ; i++) {
            System.out.print(" "+i);
        }
        System.out.println("\n task "+i+" ended ");

    }
}
