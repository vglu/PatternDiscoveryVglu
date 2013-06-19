package com.company;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 18.06.13
 * Time: 17:26
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
