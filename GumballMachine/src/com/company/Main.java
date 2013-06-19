package com.company;

import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
        GumballMachine  gumballMachine = null;
        try {
            gumballMachine = new GumballMachine("G10-New", 5);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

    }
}
