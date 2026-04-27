public class Every_Path_5 {
    /*
    takes a directed weighted graph as input and prints every cycle of lengyh 4 within the graph

    so im given a directed thing and i have to find if there is a cycle for 1
    and then also if the cycle has a length of 4
    so this im also given not an adjacency matrix or am i this is direct though
    so the other one was like dfs if its not visited and if its from i to node or node to i
    but this one has to be if the neighbor has a 1 from node to i or wait is it the other one it can only be one of them
    because it has to be connected not weakly, why it is weighted thugh does that even matter since its just about the cycles

    not adjency grpah

    not a visited thing

     */

    public static void main(String[] args) {
        int[][]matrixnotconnected =
                {{0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 0}};

        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 0, 0}
        };

       if(findPath(matrixnotconnected)){
           System.out.println("CYCLE");
       }
       else  {
           System.out.println("NO CYCLE");
       }

        if(findPath(graph)){
            System.out.println("CYCLE");
        }
        else  {
            System.out.println("NO CYCLE");
        }



    } // END MAIN

    public static boolean findPath(int[][] matrix) {
        int n = matrix.length; // do i even do this if its not 4 nodes like hsould i do a check if n < n then continue probbaly i think wait

        for (int i = 0; i < n; i++) { // for the first node

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                }

                for (int k = 0; k < n; k++) {
                    if (matrix[j][k] == 0) {
                        continue;
                    }

                    for (int l = 0; l < n; l++) {
                        if (matrix[k][l] == 0) {continue;}

                        if (matrix[l][i] != 0) { // if not 0 then it means that its connected from end l to beginning i
                            System.out.println("cycle exists" + i + " " + j + " " + k + " "+l);
                            return true;
                        }
                        else{
                           // System.out.println("no cycle" + i + " " + j + " " + k);
                        }

                    } //end l
                } //end k
            } //end j
        }// end i

        return false;

    } // END FINDPATH METHOD



}// LAST BRACKET END CLASS
