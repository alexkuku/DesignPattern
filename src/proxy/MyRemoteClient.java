package proxy;

import java.rmi.Naming;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            //通过name获取远程服务代理
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            //至此，调用代理即如同调用真实的远程对象
            String s = service.sayHello();
            System.out.println("Client received:" + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
