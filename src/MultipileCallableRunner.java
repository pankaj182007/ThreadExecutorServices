import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipileCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        List<CallableTask> callableTasks= Arrays.asList(
                new CallableTask("Pankaj"),
                new CallableTask("Pushpendra")
                ,new CallableTask("Amit"));

       List< Future<String>> future=executorService.invokeAll(callableTasks);
        for (Future<String> f:future )
        {
            System.out.println(f.get());
        }

        executorService.shutdown();
    }
}
