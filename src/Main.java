public class Main {
    public static void main(String[] args) {

        Task1 task1=new Task1();
        Task2 task2=new Task2();
       //Invoking Threads
        task1.start();
        Thread t=new Thread(task2);
        t.start();

    }
}