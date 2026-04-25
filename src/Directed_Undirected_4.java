public class Directed_Undirected_4 {

/*
write program thta takes adjacency representation of a graph with n nodes as input
and determines whether that matrix is the representation of a weakly connected graph
 */


/*
so basically im trying to see if every node is reachable from every node so if they are all connected
but ignoring edge directions so weakly connected
so i can use my dfs or bfs since cost and direction doesnt matter

to see if connected i just trakc the visited nodes and if i visit all of them then its weakly connected
like if there isnt a disconnected random in the graph then its chill


notes:
int[m][n] - so m is the rows and n is the columsn matrix [row][column]
 */

public void isConnected(int [][] inputMatrix){
    int n = inputMatrix.length; // i can just get length of matrix with this cool since its just a double array you can use the array functions
    boolean[] visited = new boolean[n]; // array of booleans that let me know if its visited not double arrya though ?


    // since its recursive search method im gonna call it from here yas

} // END ISCONENCTED METHOD




    public static void DFS(int node, int [][] inputMatrix, boolean[] visited){

    } // END DFS METHOD





} // LAST BRACKET END CLASS
