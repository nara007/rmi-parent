package com.sy.serverImpl;

import com.sy.server.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by sy on 15-3-18.
 */
public class ServerImpl extends UnicastRemoteObject implements Server
{
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p/>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws java.rmi.RemoteException if failed to export object
     * @since JDK1.1
     */
    public ServerImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        System.out.println("hello world");
        return "ABC";
    }
}
