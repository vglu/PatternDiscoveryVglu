/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck01;

/**
 *
 * @author vgl
 */
public class GumDuck extends DuckBaseClass
{
    public GumDuck(Pond _pond)
    {
        super(_pond);
    }
    
    @Override
    public void quack()
    {
        pond.printStatus("the " + this.getDuckName() + " not quack!", this.getDuckName());
    }
    
    @Override
    public String getDuckName()
    {
        return "Wery alastick gum DUCK";
    }
    
    
}
