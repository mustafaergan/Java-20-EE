package com.mustafaergan.matematik;

public class MatematikProxy implements com.mustafaergan.matematik.Matematik {
  private String _endpoint = null;
  private com.mustafaergan.matematik.Matematik matematik = null;
  
  public MatematikProxy() {
    _initMatematikProxy();
  }
  
  public MatematikProxy(String endpoint) {
    _endpoint = endpoint;
    _initMatematikProxy();
  }
  
  private void _initMatematikProxy() {
    try {
      matematik = (new com.mustafaergan.matematik.MatematikServiceLocator()).getMatematik();
      if (matematik != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)matematik)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)matematik)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (matematik != null)
      ((javax.xml.rpc.Stub)matematik)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mustafaergan.matematik.Matematik getMatematik() {
    if (matematik == null)
      _initMatematikProxy();
    return matematik;
  }
  
  public void control() throws java.rmi.RemoteException{
    if (matematik == null)
      _initMatematikProxy();
    matematik.control();
  }
  
  public int toplama(int a, int b) throws java.rmi.RemoteException{
    if (matematik == null)
      _initMatematikProxy();
    return matematik.toplama(a, b);
  }
  
  
}