public class solveSudoku 
{
    public void solveSudoku(ArrayList<ArrayList<Character>> board) 
    {
        solveSudokuUtility( board, 0, 0);
        //printMaze(board);
    }
    public boolean solveSudokuUtility(ArrayList<ArrayList<Character>> board, int row,int col)
    {   //System.out.println("size"+board.get(row).size());
        if(col == board.get(row).size())
        {
            col = 0;
            row++;
            if(row == board.size())
            {
                return true;
            }
        }
        if(board.get(row).get(col)!='.')
        {
            return solveSudokuUtility( board, row, col+1);
        }
        for (int value = 1; value <= board.size(); value++) 
        {
            char charToPlace = (char) (value + '0'); 
            if (safeToPlace(board, row, col, charToPlace)) 
            {
                board.get(row).set(col,charToPlace);
                if (solveSudokuUtility(board,row, col + 1)) 
                { 
                    return true;
                }
            }
        }
        board.get(row).set(col,'.');
        return false;
    }
    public boolean safeToPlace(ArrayList<ArrayList<Character>> board, int row,int col, Character c)
    {
       for(int i =0 ; i< board.size() ; i++)
       {
           if(board.get(row).get(i)==c)
           {
               return false;
           }
       }
       for(ArrayList<Character> ch : board)
       {
           if(ch.get(col)==c)
           {
               return false;
           }
       }
        int regionSize = (int) Math.sqrt(board.size()); 
        int I = row / regionSize;
        int J = col / regionSize;    
        int topLeftOfSubBoxRow = regionSize * I; // the row of the top left of the block
        int topLeftOfSubBoxCol = regionSize * J; // the column of the tol left of the block

        for (int i = 0; i < regionSize; i++) 
        {
            for (int j = 0; j < regionSize; j++) 
            {
                if (c == board.get(topLeftOfSubBoxRow + i).get(topLeftOfSubBoxCol + j)) 
                {
                    return false;
                }            
            }
        }
       
       return true; 
    }
    public void printMaze(ArrayList<ArrayList<Character>> board)
    {
        for(ArrayList<Character> row :board)
        {
            for(Character c : row)
            {
                System.out.print(c);
            }
            System.out.print(" ");
        }
    }
}
