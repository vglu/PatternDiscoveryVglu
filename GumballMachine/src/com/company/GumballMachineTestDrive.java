package com.company;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 19.06.13
 * Time: 11:53
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        String  argsName = "GLUSHCHENKO";
        int argsCount = 112;

        GumballMachine gumballMachine = null;
        try {
            gumballMachine = new GumballMachine(argsName, argsCount);
            try {
                Naming.rebind("//" + argsName + "/gumballmachine", gumballMachine);
            } catch (MalformedURLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        //GumballMonitor monitor = new GumballMonitor(gumballMachine);

        //monitor.report();
    }
}
