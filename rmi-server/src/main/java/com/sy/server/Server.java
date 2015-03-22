package com.sy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by sy on 15-3-18.
 */
public interface Server extends Remote
{
    public String sayHello() throws RemoteException;
}
