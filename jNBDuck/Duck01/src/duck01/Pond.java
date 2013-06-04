/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck01;

/**
 *
 * @author vgl
 */
public class Pond {
    
    public String lastStatus;
    public void  printStatus(String _messageStatus, String _objectName)
    {
        lastStatus = _objectName + " do " + _messageStatus;
    }
    
    public String getLastStatus()
    {
        return lastStatus;
    }
    
    public void printAllStatus(DuckBaseClass _duck)
    {
        _duck.display();
        //System.out.println(lastStatus);
        //_duck.quack();
        //System.out.println(lastStatus);
        //_duck.swim();
        //System.out.println(lastStatus);
        //_duck.fly();
        //System.out.println(lastStatus);
    }
}
