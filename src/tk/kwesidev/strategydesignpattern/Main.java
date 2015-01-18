package tk.kwesidev.strategydesignpattern;

public class Main {
	


	public static void main(String[] args) {
		//Calling objects at run time
		
		Context con = new Context(new Add());
        System.out.println(con.executeStrategy(100, 200));
      
        con = new Context(new Multiply());
      
                
        System.out.println(con.executeStrategy(200, 300));
        con=new Context(new Divide());
        System.out.println(con.executeStrategy(900, 0));
		
		

	}

}
