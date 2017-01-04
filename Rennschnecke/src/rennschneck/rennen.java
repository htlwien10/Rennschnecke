package rennschneck;
import AlgoTools.IO;

public class rennen {

	public static void main(String[] args) {

		rennschnecke schneck1=new rennschnecke("Hansi");
		rennschnecke schneck2=new rennschnecke("Baby", 2.5, 25);
		rennschnecke schneck3=new rennschnecke("Gomboc-Speedy", 15, -10);
		
		for (int i=1; i<=10; i++) {
			
			IO.print("Etappe ");
			IO.println(i,3);
			IO.println("=========");
			
			schneck1.krieche();
			schneck2.krieche();
			schneck3.krieche();
			
			IO.println(schneck1.toString());
			IO.println(schneck2.toString());
			
			IO.print(schneck3.getName());
			IO.println("..........."+schneck3.getRange());
			
			IO.println();
		}
	}
}
