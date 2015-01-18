package tk.kwesidev.strategydesignpattern;

public class Context {
    
    private Strategy st;
    
    public Context(Strategy st){
        
        
        
        
       this.st=st;
       
        
    }
    
    
    public int executeStrategy( int x,int y){
        
        
        return(this.st.dOperation(x, y));
        
        
    }
    
    
    
}

