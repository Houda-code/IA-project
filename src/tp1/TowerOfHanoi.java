package tp1;

public class TowerOfHanoi {
	public static String Hanoi (int nDisks,int fromP,int toP) {
		if (nDisks ==1)
			return fromP+"->"+toP+";" ;
		else {
			String sol1,sol2,sol3;
			
			int helpP=6-fromP-toP;
			sol1=Hanoi(nDisks-1,fromP,helpP);
			sol2=fromP+"->"+toP+";";
			sol3=Hanoi(nDisks-1,helpP,toP);
			
			return sol1+sol2+sol3;
		}	
	}
	public static void main(String [] args) {
		int nDisks=3;
		String stepstosolution=Hanoi(nDisks,1,3);
		for(String step:stepstosolution.split(";")) {
			System.out.println(step);
			}
	}
}