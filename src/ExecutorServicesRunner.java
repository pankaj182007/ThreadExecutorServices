import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicesRunner{

    public static void main(String[] args) {

   //Executing single thread
//       ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        executorService.execute(new Task1());
//        executorService.execute(new Thread(new Task2()));
//
//        executorService.shutdown();

   //Executing Multiple threads
        ExecutorService executorService1=Executors.newFixedThreadPool(2);

        executorService1.execute(new Task(1));

        executorService1.execute(() -> {
            for (int i = 300; i <=400 ; i++) {
                System.out.print(" "+i);

            }
        });
        executorService1.execute(new Task(2));
        executorService1.execute(new Task(3));
        executorService1.execute(new Task(4));
        executorService1.execute(new Task(5));

        executorService1.shutdown();


    }

}
