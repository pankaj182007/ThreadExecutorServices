import java.util.concurrent.*;

class CallableTask implements Callable<String>
{
    public String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " +name;
    }
}

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(1);

        Future<String> future=executorService.submit(new CallableTask("Pankaj"));
        System.out.println(future.get());

        executorService.shutdown();

    }
}
