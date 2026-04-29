public class Draw_Graph_6 {


    // if output is a text representation of graph i get extra credit
    // o need to make a representation or i don t get credit correction

    /*

    for each vertex i need to create 2 directed edges coming from it but its a cirular array so i need to connect the edged too
    so im looking at the indexes and then creating edges for each node
    so just of just like hashing vibe i am jsut caluclating things at each step and then connecting them to the index and saving it


    then i am returnign an adajncey list of where the edges go and such but an adjanecy matrix it should be values not the numbers basically



    so ive got my input that im supposed to loop through should i recursin it or just a while loop
    i am goign to loop and at each vertex compue the two neighbors and then save it into the adjancey list

     */

    public static void main (String[] args){

    }// ENDMAIN



    public static void DrawGraph(String s){
        if (s.trim().isEmpty()){
            return; // if nothing in there
        }

        String[]vertices = s.split(" ");
        int[][] adjMatrix = new int[vertices.length][vertices.length];

        for (int i = 0; i < vertices.length; i++){
            int right = (2* i + 1)% vertices.length;
            int left = (2* i + 2)% vertices.length;

            adjMatrix[i][left] = i;
            adjMatrix[i][right] = i;

        } // end for loop


    }// END DRAWGRAPH



}// LAST BRACKET END CLASS
