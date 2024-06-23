import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipileAnyCallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Getting result of Task that completed first
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        List<CallableTask> callableTasks= Arrays.asList(
                new CallableTask("Pankaj"),
                new CallableTask("Pushpendra")
                ,new CallableTask("Amit"));

        String future=executorService.invokeAny(callableTasks);

            System.out.println(future);


        executorService.shutdown();
    }
}
