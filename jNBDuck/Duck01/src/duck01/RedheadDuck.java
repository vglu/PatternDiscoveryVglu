/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck01;

/**
 *
 * @author vgl
 */
public class RedheadDuck extends DuckBaseClass
{
    public RedheadDuck(Pond _pond)
    {
        super(_pond);
    }
    
  
    @Override
    public void display()
    {
        pond.printStatus("RedHead show", this.getDuckName());
        
    }
    
    @Override
    public String getDuckName()
    {
        return "RedHead DUCK ^-(";
    }
}
