package graph;
class Vertex{
	Edge f,l;
	Vertex(){
		f=null;
		l=null;
	}
}
class Edge{
	Edge p,n;
	int e;
}
public class Representation {

	public static void main(String[] args) {
			Vertex[] v=new Vertex[5];
			Edge e=new Edge();
			v[1]=new Vertex();
			System.out.println(v[1].f);
	}

}
