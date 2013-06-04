/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck01;

/**
 *
 * @author vgl
 */
public class DuckBaseClass {
    
    public Pond pond;
    
    public DuckBaseClass(Pond _pond)
    {
        pond = _pond;
    }
    
    public void display()
    {
        throw new NullPointerException("dont do it"); 
        //throw error("dont do it");
    }
    public String getDuckName()
    {
        throw new NullPointerException("dont do it"); 
    }
    
    public void quack()
    {
        pond.printStatus("quack! ", this.getDuckName());
    }
    
    public void swim()
    {
        pond.printStatus("swim! ", this.getDuckName());
    }
    
    public void fly()
    {
        pond.printStatus("I Can fly just NOW!", this.getDuckName());
    }
}
