package tp2;
import java.util.ArrayList;
public class RechercheParLargeur{
	public RechercheParLargeur() { 
	}
	public ArrayList<Node>RPL(Node root){
		ArrayList<Node>PathToSolution = new ArrayList<Node>();
		ArrayList<Node> OpenList = new ArrayList<Node>();
		ArrayList<Node>CloseList = new ArrayList<Node>();
			
		OpenList.add(root);
		boolean goalFound = false;
			
		while(OpenList.size()>0 && !goalFound) {
			Node currentNode = OpenList.get(0);
			CloseList.add(currentNode);
			OpenList.remove(0);
			currentNode.ExpandNode();
			currentNode.PrintPuzzle();
			for(int i=0;i<currentNode.children.size();i++) {
				Node currentChild = currentNode.children.get(i);
				if(currentChild. GoalTest()) 
				{
					System.out.println("Goal found");
					goalFound=true;
					PathTrace(PathToSolution, currentChild);
				}
				if(!Contains(OpenList, currentChild)&! Contains(CloseList,currentChild))
					OpenList.add(currentChild);
		}
		return PathToSolution;
	}
	
		
	/*public void PathTrace(ArrayList<Node>path, Node n){
		System.out.println("Tracing Path");
		Node current = n;
		path.add(current);
		while(current.parent!=null) {
			current=current.parent;
			path.add(current);
		}
	}
	public static boolean Contains(ArrayList<Node>list, Node c) {
		boolean contains = false;
		for(int i=0;i<list.size(); i++)
		{
			if(list.get(i).IsSamePuzzle(c.puzzle)) {
			contains=true;
			}
		}
		return contains;
	}*/
}


			
			