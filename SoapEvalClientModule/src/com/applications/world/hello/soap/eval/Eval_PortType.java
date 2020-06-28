/**
 * Eval_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.applications.world.hello.soap.eval;

public interface Eval_PortType extends java.rmi.Remote {
    public java.lang.String getValue(java.lang.String expression) throws java.rmi.RemoteException;
    public void setValue(java.lang.String expression, java.lang.String newValue, java.lang.String changeReason) throws java.rmi.RemoteException;
    public java.lang.String[] getValues(java.lang.String[] expressions) throws java.rmi.RemoteException;
    public java.lang.String[] getChildren(java.lang.String expression) throws java.rmi.RemoteException;
    public java.lang.String[] setValues(java.lang.String[] expressions, java.lang.String[] newValues, java.lang.String changeReason) throws java.rmi.RemoteException;
    public com.applications.world.hello.soap.eval.GQLNode[] getFilteredChildren(java.lang.String expression, java.lang.String filter) throws java.rmi.RemoteException;
    public java.lang.String[] getDisplayValues(java.lang.String[] expressions) throws java.rmi.RemoteException;
    public com.applications.world.hello.soap.eval.GQLNode getNamedTrendLog(java.lang.String eqRefPath, java.lang.String trendLogRefName) throws java.rmi.RemoteException;
    public void setDisplayValue(java.lang.String expression, java.lang.String newDisplayValue, java.lang.String changeReason) throws java.rmi.RemoteException;
    public java.lang.String getDisplayValue(java.lang.String expression) throws java.rmi.RemoteException;
    public java.lang.String[] setDisplayValues(java.lang.String[] expressions, java.lang.String[] newValues, java.lang.String changeReason) throws java.rmi.RemoteException;
    public java.lang.String getSoapSourceAddress() throws java.rmi.RemoteException;
}
