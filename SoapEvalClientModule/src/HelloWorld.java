import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.applications.world.hello.soap.eval.*;

public class HelloWorld {

    static String testPath = "/trees/config/system/auditlogging/auditlogfile/logfilename.value";
    static Logger logger = Logger.getLogger(HelloWorld.class);

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
        SoapEval worker = new SoapEval();

        logger.info("Entering Application.");

        String path = testPath;
        String result = worker.getValue(path);
        System.out.println("GET: " + result);

        logger.info("Exiting application");
    }
}

