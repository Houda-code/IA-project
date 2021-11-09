package tp2;
import java.util.ArrayList;

public class Node {
	
	ArrayList <Node> children =new ArrayList <Node>();
	public Node parent;
	public int [] puzzle = new int [9];
	public int X=0;
	public int col=3;
	
	public Node(int[]p) {
		SetPuzzle(p);
	}
	public void SetPuzzle(int p[]) {  /*modifier le puzzle*/
		for (int i=0;i<puzzle.length;i++) {
			this.puzzle[i]=p[i];
		}
	}
	public void ExpandNode(){ /*developper noeud*/
		for(int i=0;i<puzzle.length;i++) {
			if(puzzle[i]==0)
				X=i;
		}
		movetoright(puzzle,X);
		moveToleft(puzzle,X);
		moveToup(puzzle,X);
		moveTodown(puzzle,X);	
	}
	
	public void movetoright(int p[], int i) {
		if(i%col<col-1){
			int [] pc = new int[9];
			CopyPuzzle(pc, p);
			int temp=pc[i+1];
			pc[i+1] =p[i];
			pc[i]=temp;
			Node child = new Node(pc);
			children.add(child);
			child.parent=this;
		}
	}

	public void moveToleft(int p[], int i) {
		if( i-col>0) {
			int[] pc = new int[9];
			CopyPuzzle(pc, p);
			int temp=pc[i-1];
			pc [i-1]=pc[i];
			pc[i]=temp;
			Node child = new Node(pc);
			children.add(child);
			child.parent =this;
		}
	}
	public void moveToup(int p[], int i) {
		if(i-col>= 0) {
			int[] pc = new int[9];
			CopyPuzzle(pc, p);
			int temp=pc [1-3];
			pc [1-3]=pc[1];
			pc[1]=temp;
			Node child = new Node(pc);
			children.add(child);
			child.parent=this;
		}
	}
	public void moveTodown(int p[], int i) { 
		if(i+col< puzzle.length) {
			int[] pc = new int[9];
			CopyPuzzle(pc, p);
			int temp = pc[1+3];
			pc[1+3]=pc[1];
			pc[1]=temp;
			Node child=new Node(pc);
			children.add(child);
			child.parent=this;
		}
	}
	
	public void PrintPuzzle() {
		int m=0;
		for(int i=0;i<col;i++){
			for(int j=0;j<col;i++){
				System.out.print(puzzle[m]+" ");
				m++;
			}
			System.console();
		}
	}
	

	
	public boolean IsSamePuzzle(int[] p) {
		boolean samePuzzle=true;
		for(int i=0;i<p.length;i++) {
			if(puzzle[i]!=p[i]) {
				samePuzzle=false;
			}
		}
		return samePuzzle;
	}
	
	public void CopyPuzzle(int []a, int[] b) {
		for(int i=0;i<b.length; i++)
		{
		a[1]= b[i];
		}
	}
	public boolean GoalTest() {
		boolean isGoal = true;
		int m =puzzle[0];
		for(int i =0 ; i<puzzle.length; i++)
		{
			if(m>puzzle[1])
			{
				isGoal=false;
				m=puzzle[1];
			}
		return isGoal;
		}
		return isGoal;
	}*/
		
		
}