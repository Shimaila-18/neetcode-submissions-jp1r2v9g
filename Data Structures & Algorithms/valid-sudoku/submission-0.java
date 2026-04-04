class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
        HashSet<Character> rowMap = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                if(rowMap.contains(board[i][j])){
                    return false;
                }else{
                    rowMap.add(board[i][j]);
                }
                }
            }
        }
        for(int i=0;i<9;i++){
        HashSet<Character> colMap = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                if(colMap.contains(board[j][i])){
                    return false;
                }else{
                    colMap.add(board[j][i]);
                }
                }
            }
        }
        for(int k=0;k<9;k++){
        HashSet<Character> squareMap = new HashSet<>();
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    int row = (k/3)*3+i;
                    int col = (k%3)*3+j;
                if(board[row][col]!='.'){
                if(squareMap.contains(board[row][col])){
                    return false;
                }else{
                    squareMap.add(board[row][col]);
                }
                }
            }
            }
        }

        return true;
    }
}
