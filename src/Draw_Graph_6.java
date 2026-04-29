
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Draw_Graph_6 extends JPanel { // whats diff between jframe and j panel?


    // if output is a text representation of graph i get extra credit
    // o need to make a representation or i don t get credit correction

    /*
    i feel like the question is easy but i dont understand how it is written as a question idk what that was asking me until explained

    for each vertex i need to create 2 directed edges coming from it but its a cirular array so i need to connect the edged too
    so im looking at the indexes and then creating edges for each node
    so just of just like hashing vibe i am jsut caluclating things at each step and then connecting them to the index and saving it


    then i am returnign an adajncey list of where the edges go and such but an adjanecy matrix it should be values not the numbers basically



    so ive got my input that im supposed to loop through should i recursin it or just a while loop
    i am goign to loop and at each vertex compue the two neighbors and then save it into the adjancey list

     */

    String [] vertices;


    public Draw_Graph_6(String s) {
        vertices = s.split(" ");
    }
    public static void main (String[] args){

       String input1= "ANT CUN BOG AMA DC TOL SAN";
       DrawGraph(input1);

       JFrame frame = new JFrame("Draw Graph 6");
       Draw_Graph_6 draw_graph = new Draw_Graph_6(input1);

       frame.add(draw_graph);
       frame.setSize(400,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);


    }// ENDMAIN



    public static void DrawGraph(String s){
        if (s.trim().isEmpty()){
            return; // if nothing in there
        }

        String[]vertices = s.split(" ");
        int[][] adjMatrix = new int[vertices.length][vertices.length];

        for (int i = 0; i < vertices.length; i++){ // literally just a loop and math
            int right = (2* i + 1)% vertices.length;
            int left = (2* i + 2)% vertices.length;

            adjMatrix[i][left] = 1;
            adjMatrix[i][right] = 1;

        } // end for loop

        for (int i = 0; i < vertices.length; i++){
            for (int j = 0; j < vertices.length; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println(); // printing jsut as the adjency graph and not the image rn ill make do that in another class? / method
        }

    }// END DRAWGRAPH


    @Override
    protected void paintComponent(Graphics g){ // must be protected
            super.paintComponent(g);

            int n = vertices.length;
            if (n== 0){return;}
//            int []x = {300, 200, 400, 150, 250, 350, 450};
//            int []y = {50, 150, 150, 250, 250, 250, 250};
        int []x = new int[n];
        int []y = new int[n];

        for (int i = 0; i < vertices.length; i++){
            double angle = 2 * Math.PI* i / n;
            x[i] = (int)(300 + 200 * Math.cos(angle));
            y[i] = (int)(200 + 200 * Math.sin(angle));
            // putting in circles because all my lines were overlapping and weird looking- like grid vibe
        }

        for (int i = 0; i < vertices.length; i++){ // literally just a loop and math
            int right = (2* i + 1)% vertices.length;
            int left = (2* i + 2)% vertices.length;


            g.drawLine(x[i], y[i], x[right], y[right]);
            g.drawLine(x[i], y[i], x[left], y[left]);

        } // end for loop

        for (int i = 0; i<vertices.length; i++){
            g.drawString(vertices[i], x[i], y[i]);
        }




    }// end image of graph



}// LAST BRACKET END CLASS
