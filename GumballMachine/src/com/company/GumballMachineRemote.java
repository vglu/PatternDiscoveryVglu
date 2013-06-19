package com.company;

import java.rmi.*;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 19.06.13
 * Time: 12:25
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
