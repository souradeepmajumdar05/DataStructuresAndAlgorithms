package Arrays;

public class ValidSudoku 
{
    public boolean isValidSudoku(char[][] board) 
    {
        short[] cols = new short[9], box = new short[3];
        for (int r = 0; r < 9; r++) 
        {
            if (r % 3 == 0) 
            {
                Arrays.fill(box, (short) 0);
            }
            short row = 0;
            for (int c = 0; c < 9; c++) 
            {
                char ch = board[r][c];
                if (ch == '.') {
                    continue;
                }
                short m = (short) (1 << ch - '0');
                if ((row & m) > 0) {
                    return false;
                }
                row |= m;
                if ((cols[c] & m) > 0) {
                    return false;
                }
                cols[c] |= m;
                
                int i = c / 3;
                if ((box[i] & m) > 0) {
                    return false;
                }
                box[i] |= m;
            }
        }
        return true;
    }
}
