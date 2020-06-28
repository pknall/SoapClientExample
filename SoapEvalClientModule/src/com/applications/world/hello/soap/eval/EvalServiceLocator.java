/**
 * EvalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.applications.world.hello.soap.eval;

public class EvalServiceLocator extends org.apache.axis.client.Service implements com.applications.world.hello.soap.eval.EvalService {

    public EvalServiceLocator() {
    }


    public EvalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EvalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Eval
    private java.lang.String Eval_address = "http://localhost/_common/webservices/Eval";

    public java.lang.String getEvalAddress() {
        return Eval_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EvalWSDDServiceName = "Eval";

    public java.lang.String getEvalWSDDServiceName() {
        return EvalWSDDServiceName;
    }

    public void setEvalWSDDServiceName(java.lang.String name) {
        EvalWSDDServiceName = name;
    }

    public com.applications.world.hello.soap.eval.Eval_PortType getEval() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Eval_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEval(endpoint);
    }

    public com.applications.world.hello.soap.eval.Eval_PortType getEval(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.applications.world.hello.soap.eval.EvalSoapBindingStub _stub = new com.applications.world.hello.soap.eval.EvalSoapBindingStub(portAddress, this);
            _stub.setPortName(getEvalWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEvalEndpointAddress(java.lang.String address) {
        Eval_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.applications.world.hello.soap.eval.Eval_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.applications.world.hello.soap.eval.EvalSoapBindingStub _stub = new com.applications.world.hello.soap.eval.EvalSoapBindingStub(new java.net.URL(Eval_address), this);
                _stub.setPortName(getEvalWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Eval".equals(inputPortName)) {
            return getEval();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/_common/webservices/Eval", "EvalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/_common/webservices/Eval", "Eval"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Eval".equals(portName)) {
            setEvalEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
