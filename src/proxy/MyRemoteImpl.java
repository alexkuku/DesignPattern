package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 1.实现MyRemote接口
 * 2.继承UnicastRemoteObject对象，使得这个类成为远程服务对象
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "rmi say: Hello!";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            //打开java的rmi服务
            LocateRegistry.createRegistry(1099);
            //给代理的服务命名
            Naming.bind("rmi://127.0.0.1/RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
