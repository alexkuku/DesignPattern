package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 代理服务的接口，继承自java.rmi下的Remote接口
 * 注：Remote只是一个记号接口
 */
public interface MyRemote extends Remote {

    /**
     * 要实现的方法
     * @return
     * @throws RemoteException
     */
    public String sayHello() throws RemoteException;
}
