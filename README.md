# SoapClientExample
- - -
This application is a "Hello World" example for creating a Apache Axis Soap Client.
Assumes you have a "Tomcat" style web server running on localhost.

The procedure for creating 
this application in IntelliJ is:
1) Create a new, generic Java Project
2) In the new Project, create a new Module
    * Files → Project Structure → Project Settings → Modules
    * "+" → New Module → Web Services Client
    * Version → Apache Axis
    * Libraries → Download
    * Generate Sample Client Code → Checked
    * Click "Next"
    * Enter a Module Name and click "Finish"
    * Click "OK"
    * When the Soap Configuration window pops up, click "Cancel"
3) In the new Module under the source directory "src", right click and select "Create a new Package" → Name the Package
4) Right Click the new package and click "Create Web Service Client" and enter the following fields:
    * Name
    * URL (may need to press ENTER for the form to recognize the new address and enable "OK")
    * Username
    * Password
    * Output Mode → Client
    * Type Mapping Version → 1.1
    * Allow Extentions → Checked
    * Generate Test Case
    * Generate Classes for Schema Group
    * Generate Unreferenced Elements
    * Support wrapped document/literal style → Checked
    * Press OK
5) Must update the SoapEval class for GetValue and SetValue routines (which are defined by the WSDL) - See SoapEval class
6) Generate a "Hello, world" application to test
7) TODO: Be able to use this outside the existing module (create a JAR)

The following 7 files are autogenerated using these settings:
* Eval.wsdl
* Eval_PortType
* EvalService
* EvalServiceLocator
* EvalSoapBindingStub
* GQLNode
* SoapEval (later edited)

2020-07-04
Received the following Warning: 
>org.apache.axis.utils.JavaUtils  - Unable to find required classes (javax.activation.DataHandler and javax.mail.internet.MimeMultipart). Attachment support is disabled.

Added "activation.jar" and "javax.mail.jar" to clear this warning based on recommendations from [StackOverflow.com](https://stackoverflow.com/questions/12227035/unable-to-find-required-classes-javax-activation-datahandler-and-javax-mail-int).

Added SoapTools-1.0.jar, which takes the Soap Eval client and places it in a JAR file.  This JAR will
work if it is installed on a local server.  

Added "HelloWorld2.java" which uses SoapTools-1.0.jar instead of the included Module.

NOTE:  The "create new module" portion of the instructions was skipped in the creation of the JAR file.  The idea was
to test if a "HelloWorld" class could operate with the SoapEval module contained in a separate module.   
Placing this code in the JAR file removes the need for a second module.