/**
 * EvalService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.applications.world.hello.soap.eval;

public interface EvalService extends javax.xml.rpc.Service {
    public java.lang.String getEvalAddress();

    public com.applications.world.hello.soap.eval.Eval_PortType getEval() throws javax.xml.rpc.ServiceException;

    public com.applications.world.hello.soap.eval.Eval_PortType getEval(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
