package com.company;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 18.06.13
 * Time: 17:29
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, no balls there ...");
        //gumballMachine.setState(gumballMachine.getSoldOutState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Good bye, may be another time");
    }

    @Override
    public void turnCrank() {
        System.out.println("yes you can");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing to dispense");
    }
}
