import java.io.IOException;

public class Timer implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            Situation sit = new Situation();
            sit.show();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
