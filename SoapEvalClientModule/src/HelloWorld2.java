import com.ccgautomation.eval.EvalClient;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld2 {

    static String testPath = "/trees/config/system/auditlogging/auditlogfile/logfilename.value";
    static Logger logger = Logger.getLogger(HelloWorld2.class);

    private static void sleep(int duration)
    {
        try {
            Thread.sleep(duration);
        }
        catch (InterruptedException ex) {
            logger.error(ex.getMessage());
        }
    }
    private static void sleep()
    {
        sleep(1000);
    }

    public static void main(String[] argv) {

        //BasicConfigurator.configure();
        PropertyConfigurator.configure("LogConfiguration.txt");

        EvalClient worker = new EvalClient();

        logger.info("Entering Application.");

        String path = testPath;
        String result = worker.getValue(path, "test", "12345678");
        System.out.println("GET: " + result);

        logger.info("Exiting application");
    }
}
