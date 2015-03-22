package com.sy.serverInstance;

import com.sy.serverImpl.ServerImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by sy on 15-3-18.
 */
public class Server
{
    public static void main(String[] args) {


        try {
            ServerImpl server=new ServerImpl();
            int port=1099;
            LocateRegistry.createRegistry(port);
            String address = "rmi://localhost:" + port + "/hello";
            Naming.bind(address, server);
            System.out.println("started...服务器启动成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
