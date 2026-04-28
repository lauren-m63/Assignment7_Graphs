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

        int[][]matrixnotconnected=
            {{0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 0, 0, 0}};
        System.out.println(isConnected(matrix));
        System.out.println(isConnected(matrixnotconnected));

    } // END MAIN



public static boolean isConnected(int[][] adjMatrix){ // taking an adjanecy matrix not an actual matrix just the numbers saying true/false if they are connected or not with edge
    int n = adjMatrix.length; // i can just get length of matrix with this cool since its just a double array you can use the array functions
        // this is the number of rows for length though so this is the number of vertices in the graph
        // since its an adjceny graph the rows and columsn are the same thouhgh for this but usually its by row anyway?


    boolean[] visited = new boolean[n]; // array of booleans that let me know if its visited not double arrya though
        //each index represents the node since its likegoing by the length which is teh number of vertexes
        // so this is creating a list of boolean with length n which is how many nodes there are- so for each row its like have we visited this one

    DFS(0, adjMatrix, visited); // i can just call this once because my separate method is where its recurisve so i call it once here and itll run the whole graph over there -
        // so i start at node 0 aka the first row /column and then itll explore the hwole thing
        // since its recursive search method im gonna call it from here yas
    for (int i = 0; i<n; i++ ) {
        if (!visited[i]) { // so i do dfs and then now im like were they all visited and if not then its not connected
            return false; // looping through my visited list and if one of them is false then return false
        }
        // the visited array in dfs is the same one since im passing the one in here as a reference into the other method
        // since im calling dfs in here with the visited array in here, it goes into dfs and gets modified and so i can access the change in here
    }
    return true;
} // END ISCONENCTED METHOD




    public static void DFS(int node, int [][] inputMatrix, boolean[] visited){
        // dfs is the depth one so goes down all the chain and visits adjacent enighbors then goes all the way up to the top level unvisited one

        visited[node] = true; // marking a node as visited and its the first line since im calling this over and over again on a diff node so everytime a new node drops in this method its marked as visited and i start it in the method above with node 0
            // prevents infinite loops
            // since im updating my visited one at the end when it exits because all the possible neighbors have been visited ill jave a visited list and if they are all true then all have been visited=  connected
        int n = inputMatrix.length; // num of nodes so i can loop it


        for ( int i = 0; i < n; i++ ){ // for all the nodes if they have not been visited and there is a connection to another then do this again but with my new node
                // so when i do it again im marking the one im doing as visited and getting the rows for my column and looking at all the neighbors of my curren cool
            if (!visited[i] && (inputMatrix[node][i] == 1 || inputMatrix[i][node] == 1) ){ // its or because it doesnt matter the direction
                DFS(i,inputMatrix,visited);
            }
        }


    } // END DFS METHOD





} // LAST BRACKET END CLASS
