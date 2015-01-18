package tk.kwesidev.strategydesignpattern;

public class Add implements Strategy{
    
    
    @Override
    public int dOperation(int x,int y)
    {
        
        return x+y;
        
        
    }
}
