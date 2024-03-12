package graphtheory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WeakVertices {
	
    static int size = 0;
    static String [] [] grid= new String[101][101];

	public WeakVertices() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s;
	        while ((s=br.readLine())!=null&&!s.equals("-1"))
	        {
	            size = Integer.parseInt(s);
	            for (int i=0;i<size;i++) {
	                grid[i] = br.readLine().split(" ");
	            }
	            ArrayList<Integer> vertices = new ArrayList<>();
	            for (int row = 0;row<size;row++)
	            {
	                ArrayList<Integer> list = new ArrayList<>();
	                for (int col =0;col<size;col++)
	                    if (grid[row][col].equals("1")) {
	                        list.add(col);
	                    }
	                if (list.size()<=1) {
	                    vertices.add(row);
	                }
	                else
	                {
	                    boolean weak = true;
	                    for (int i=0;i<list.size()&&i<size;i++)
	                    {
	                        for (int col =0;col<size;col++)
	                            if (col!=row&&list.contains(col) && list.get(i)>0&&grid[list.get(i)][col].equals("1"))
	                                weak = false;;
	                    }
	                    if (weak)
	                        vertices.add(row);
	                }

	            }
	            if (size!=0) {
	                String sol = "";
	                for (int i = 0; i < vertices.size(); i++) {
	                    sol += vertices.get(i) + " ";
	                }
	                if (sol.length()>0) {
	                	System.out.println(sol.substring(0, sol.length() - 1));
	                }
	                else
	                    System.out.println("");
	            }
	        }
	    }
}
