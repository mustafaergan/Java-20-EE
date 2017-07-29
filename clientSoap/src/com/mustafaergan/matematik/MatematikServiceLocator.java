/**
 * MatematikServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mustafaergan.matematik;

public class MatematikServiceLocator extends org.apache.axis.client.Service implements com.mustafaergan.matematik.MatematikService {

    public MatematikServiceLocator() {
    }


    public MatematikServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MatematikServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Matematik
    private java.lang.String Matematik_address = "http://localhost:8080/ServerSOAP/services/Matematik";

    public java.lang.String getMatematikAddress() {
        return Matematik_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MatematikWSDDServiceName = "Matematik";

    public java.lang.String getMatematikWSDDServiceName() {
        return MatematikWSDDServiceName;
    }

    public void setMatematikWSDDServiceName(java.lang.String name) {
        MatematikWSDDServiceName = name;
    }

    public com.mustafaergan.matematik.Matematik getMatematik() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Matematik_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMatematik(endpoint);
    }

    public com.mustafaergan.matematik.Matematik getMatematik(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mustafaergan.matematik.MatematikSoapBindingStub _stub = new com.mustafaergan.matematik.MatematikSoapBindingStub(portAddress, this);
            _stub.setPortName(getMatematikWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMatematikEndpointAddress(java.lang.String address) {
        Matematik_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mustafaergan.matematik.Matematik.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mustafaergan.matematik.MatematikSoapBindingStub _stub = new com.mustafaergan.matematik.MatematikSoapBindingStub(new java.net.URL(Matematik_address), this);
                _stub.setPortName(getMatematikWSDDServiceName());
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
        if ("Matematik".equals(inputPortName)) {
            return getMatematik();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://matematik.mustafaergan.com", "MatematikService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://matematik.mustafaergan.com", "Matematik"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Matematik".equals(portName)) {
            setMatematikEndpointAddress(address);
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
