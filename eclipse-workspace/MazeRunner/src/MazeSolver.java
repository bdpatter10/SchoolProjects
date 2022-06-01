/**
 * MazeSolver attempts to recursively traverse a Maze. The goal is to get from the
 * given starting position to the bottom right, following a path of 1's. Arbitrary
 * constants are used to represent locations in the maze that have been TRIED
 * and that are part of the solution PATH.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class MazeSolver
{
   private Maze maze;
   
   /**
    * Constructor for the MazeSolver class.
    */
   public MazeSolver(Maze maze)
   {
      this.maze = maze;
   }
   
   /**
    * Attempts to recursively traverse the maze. Inserts special
    * characters indicating locations that have been TRIED and that
    * eventually become part of the solution PATH.
    *
    * @param row row index of current location
    * @param column column index of current location
    * @param dep the depth of the array
    * @return true if the maze has been solved
    */
   public boolean traverse(int row, int column, int dep)
   {
      boolean done = false;
    
      if (maze.validPosition(row, column, dep))
      {
         maze.tryPosition(row, column, dep);   // mark this cell as tried
      
         if (row == maze.getRows()-1 && column == maze.getColumns()-1 &&
        		 dep == maze.getDepth() -1)  
            done = true;  // the maze is solved
         else
         {
            done = traverse(row+1, column, dep);      // down
            if (!done)
               done = traverse(row, column+1, dep);  // right
            if (!done)
               done = traverse(row-1, column, dep);  // up
            if (!done)
               done = traverse(row, column-1, dep);  // left
            if (!done)
            		done = traverse(row, column, dep-1); //forward
            if (!done)
            		done = traverse(row, column, dep+1); //backward
         }
      
         if (done)  // this location is part of the final path
            maze.markPath(row, column, dep);
      }
    
      return done;
   }
}
