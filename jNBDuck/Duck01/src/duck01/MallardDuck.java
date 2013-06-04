/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck01;

/**
 *
 * @author vgl
 */
public class MallardDuck extends DuckBaseClass
{
    public MallardDuck (Pond _pond)
    {
        super(_pond);
    }
    
   
    @Override
    public void display()
    {
        pond.printStatus("Marral show", this.getDuckName());
        
    }
    
    @Override
    public String getDuckName()
    {
        return "Marral DUCK ^-)";
    }
}
