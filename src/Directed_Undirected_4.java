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


    public static void main(String[] args) {
        int[][] matrix= {
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };

    } // END MAIN



public boolean isConnected(int [][] adjMatrix){ // taking an adjanecy matrix not an actual matrix just the numbers saying true/false if they are connected or not with edge
    int n = adjMatrix.length; // i can just get length of matrix with this cool since its just a double array you can use the array functions
        // this is the number of rows for length though so this is the number of vertices in the graph
        // since its an adjceny graph the rows and columsn are the same thouhgh for this but usually its by row anyway?
    boolean[] visited = new boolean[n]; // array of booleans that let me know if its visited not double arrya though
        //each index represents the node since its likegoing by the length which is teh number of vertexes
        // so this is creating a list of boolean with length n which is how many nodes there are- so for each row its like have we visited this one

    DFS(0, adjMatrix, visited);
    // since its recursive search method im gonna call it from here yas
    for (int i = 0; i<n; i++ ) {
        if (!visited[i]) { // so i do dfs and then now im like were they all visited and if not then its not connected
            return false;
        }

    }
    return true;
} // END ISCONENCTED METHOD




    public static void DFS(int node, int [][] inputMatrix, boolean[] visited){
        // dfs is the depth one so goes down all the chain and visits adjacent enighbors then goes all the way up to the top level unvisited one

        visited[node] = true; // marking a node as visited why the first line though?
        int n = inputMatrix.length; // num of nodes so i can loop it


        for ( int i = 0; i < n; i++ ){ // for all the nodes if they have not been visited and there is a connection to another then do this again but with my new node
                // so when i do it again im marking the one im doing as visited and getting the rows for my column and looking at all the neighbors of my curren cool
            if (!visited[i] && (inputMatrix[node][i] == 1 || inputMatrix[i][node] == 1) ){ // its or because it doesnt matter the direction
                DFS(i,inputMatrix,visited);
            }
        }


    } // END DFS METHOD





} // LAST BRACKET END CLASS
