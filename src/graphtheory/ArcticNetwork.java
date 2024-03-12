package graphtheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArcticNetwork {

	public ArcticNetwork() {
		// TODO Auto-generated constructor stub
	}
	
	   public static class Edge implements Comparable<Edge> {

	        int dx, dy;
	        double weight;

	        public Edge(int dx, int dy, double weight) {
	            this.dx = dx;
	            this.dy = dy;
	            this.weight = weight;
	        }

	        @Override
	        public int compareTo(Edge other) {
	            return Double.compare(this.weight, other.weight);
	        }

	    }
	   
	   
	// Find the root of the set that includes point
	public static int find(int point,int [] arr) {
		if(point==arr[point])  {
			return point;
		}
		else {
			return find(arr[point],arr);
		}
	}
	
	//Merge the set that includes element i and the set that includes element j
    public static int union(Edge edges, ArrayList<Double> distances, int[] arr) {
        int dx = find(edges.dx, arr);
        int dy = find(edges.dy, arr);
        
        if(dx!=dy) {
        	arr[dx] = dy;
        	distances.add(edges.weight);
        	return 1;
        }
        return 0;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	        int testcases = Integer.parseInt(in.readLine());
	        while (testcases > 0) {
	            String input [] = in.readLine().split(" ");
	            int channels = Integer.parseInt(input[0]);
	            int outposts = Integer.parseInt(input[1]);
	            Edge[] graph = new Edge[outposts];
	            int[] arr = new int[outposts];
	            ArrayList<Edge> list = new ArrayList<>();

	            for (int i = 0; i < outposts; i++) {
	                input =  in.readLine().split(" ");
	                int x = Integer.parseInt(input[0]);
	                int y = Integer.parseInt(input[1]);
	                graph[i] = new Edge(x, y, 0);
	                arr[i] = i;
	            }

	            for (int i = 0; i < outposts; i++) {
	                for (int j = i + 1; j < outposts; j++) {
	                    double x = graph[i].dx - graph[j].dx;
	                    double y = graph[i].dy - graph[j].dy;
	                    double d = Math.hypot(x, y);
	                    list.add(new Edge(i, j, d));
	                }
	            }
	            Collections.sort(list);

	            int edges = 0;
	            ArrayList<Double> distance = new ArrayList<>();
	            for (int i = 0; edges < outposts - channels; i++) {
	                edges+=union(list.get(i), distance, arr);
	            }
	            System.out.print(String.format("%.2f\n", distance.get(edges - 1)));
	            
	            testcases--;
	        }
	}
}

