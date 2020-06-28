package com.applications.world.hello.soap.eval;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SoapEval {

    static Logger logger = Logger.getLogger(SoapEval.class);

    static {
        PropertyConfigurator.configure("LogConfiguration.txt");
    }

    /**
     * Retrieve a value using the getValue() service defined in the Eval WSDL.
     * @param path Full Qualified Location of the value to be retrieved
     * @return The value at "path".
     */
    public String getValue(String path) {
        String result = "";

        logger.info("Entering EvalWorker.getValue()");
        try {

            EvalServiceLocator locator = new EvalServiceLocator();

            Eval_PortType service = locator.getEval();

            ((EvalSoapBindingStub)service).setUsername("test");
            ((EvalSoapBindingStub)service).setPassword("12345678");

            result = service.getValue(path);

        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
        logger.info("Returning: " + result);
        return result;
    }

    /**
     * Sets the location at "path" to the given "value" using the setValue() service defined in the WSDL.
     * @param path Full Qualified Location of the value to be set
     * @param value The value to set "path" to.  (This value may need to be type checked to prevent setting a numeric path to NaN.
     */
    public void setValue(String path, String value) {
        logger.info("Entering EvalWorker.setValue()");
        try {

            EvalServiceLocator locator = new EvalServiceLocator();

            Eval_PortType service = locator.getEval();

            ((EvalSoapBindingStub)service).setUsername("test");
            ((EvalSoapBindingStub)service).setPassword("12345678");

            service.setValue(path,value,"");

        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        }
        catch (Exception ex) {
            logger.error(ex.getMessage());
            logger.error("This exception was not expected");
        }
        logger.info("Exiting EvalWorker.setValue()");
    }

  /* Code Packaged with Example
  public static void main(String[] argv) {
      try {
          EvalServiceLocator locator = new EvalServiceLocator();
          Activator service = locator.get();
          // If authorization is required
          //((EvalSoapBindingStub)service).setUsername("user3");
          //((EvalSoapBindingStub)service).setPassword("pass3");
          // invoke business method
          service.businessMethod();
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }

   */
}
