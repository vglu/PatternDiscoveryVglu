package com.company;

import java.rmi.Naming;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 19.06.13
 * Time: 14:48
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[]    location = {"rmi://glushchenko/gumballmachine"};
        
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
