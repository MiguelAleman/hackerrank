package algorithms.code_golf.sudoku;

import java.io.PrintStream;
import java.util.*;

public class Solution {

    // key(string) = ij, value = set with possible values
    static Map<String, Set<Integer>> possibleValues;

    // limits for differentiate squares in a cell
    static int ldi=0, lui=0, ldj=0, luj=0;

    // total number of elements already on the board
    static int total;

    // Sudoku values (1-9)
    static final Integer[] SET_VALUES = new Integer[] { 1,2,3,4,5,6,7,8,9 };

    static PrintStream out = System.out;

    /**
     * This method receives a sudoku grid and prints out one solution
     * @param grid
     */
    static boolean sudoku_solve(int [][] grid){
        total=0;
        possibleValues = new HashMap<>();
        addPossibleValues(grid);
        while(total < 81){
            while(firstApproach(grid));
            while(secondApproach(grid));
            if(!firstApproach(grid)&&!secondApproach(grid)){
                if(!makeAssumption(grid)&&total<81){
                    return false;
                }
            }
        }
        printGrid(grid);
        return true;
    }
    /**
     * This approach looks for all the sets who only have 1 value in it
     * In this case that value is the correct value for that cell
     * @param grid sudoku board
     */
    static boolean firstApproach(int[][] grid){
        boolean somethingAdded = false;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                Set<Integer> temp = possibleValues.get(i+""+j);
                if(grid[i][j]==0 && temp.size()==1){
                    grid[i][j] = temp.toArray(new Integer[temp.size()])[0];
                    updatePossibleValues(grid, i, j, temp.toArray(new Integer[temp.size()])[0]);
                    somethingAdded = true;
                    total++;
                }
            }
        }
        return somethingAdded;
    }

    /**
     * This approach looks for a possible element of a cell and it verifies if it can be used
     * as the value
     * @param grid sudoku board
     * @return
     */
    static boolean secondApproach(int[][] grid){
        boolean somethingAdded = false;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(grid[i][j]==0){
                    for(Integer e :  possibleValues.get(i+""+j)){
                        boolean eAdded = false;
                        for(int m = 0; m < 9; m++){ // Row
                            if(grid[i][m]==0 && m!=j){
                                if(possibleValues.get(i+""+m).contains(e)){
                                    break;
                                }
                            } else if(m==8){
                                grid[i][j] = e;
                                updatePossibleValues(grid,i,j,e);
                                somethingAdded=eAdded=true;
                                total++;
                                continue;
                            }
                        }
                        if(eAdded)
                            break;
                        for(int m = 0; m < 9; m++){ // Column
                            if(grid[m][j]==0 && m!=i){
                                if(possibleValues.get(m+""+j).contains(e)){
                                    break;
                                }
                            } else if(m==8){
                                grid[i][j] = e;
                                updatePossibleValues(grid,i,j,e);
                                somethingAdded=eAdded=true;
                                total++;
                                continue;
                            }
                        }
                        if(eAdded)
                            break;
                        setLimits(getBlockNumber(i,j));
                        for (int m = ldi; m <= lui; m++) { // Block
                            boolean breaked = false;
                            for (int n = ldj; n <= luj; n++) {
                                if(grid[m][n]==0 && !(m==i && n==j)){
                                    if(possibleValues.get(m+""+n).contains(e)){
                                        breaked = true;
                                        break;
                                    }
                                } else if(m==lui && n==luj){
                                    grid[i][j] = e;
                                    updatePossibleValues(grid,i,j,e);
                                    somethingAdded=eAdded=true;
                                    total++;
                                    continue;
                                }
                            }
                            if(breaked){
                                break;
                            }
                        }
                        if(eAdded)
                            break;
                    }
                }
            }
        }
        return somethingAdded;
    }



    /**
     * This method makes one assumption
     * It is neccessary given that sudoku games can have multiple solutions
     * sometime is time consuming :/
     * @param grid sudoku board
     */
    static boolean makeAssumption(int[][] grid){
        int less_e = 99;
        int ti = 0, tj = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> set = possibleValues.get(i + "" + j);
                    if (set.size() < less_e && set.size() != 0) {
                        less_e = set.size();
                        ti = i;
                        tj = j;
                    }
                }
            }
        }
        if(less_e!=99){
            Random rg = new Random();
            int r = rg.nextInt(possibleValues.get(ti+""+tj).size());
            int count = 0;
            for(Integer e: possibleValues.get(ti+""+tj)){
                if(count == r){
                    grid[ti][tj] = e;
                    updatePossibleValues(grid, ti, tj, e);
                    total++;
                    return true;
                }else
                    count++;
            }
        }
        return false;
    }

    /**
     * Add a set with possible values to each cells
     * @param grid sudoku board
     */
    static void addPossibleValues(int[][] grid){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(grid[i][j]==0){
                    Set<Integer> set = new HashSet<>(Arrays.asList(SET_VALUES));
                    for(int k = 0; k < 9; k++){
                        if(grid[i][k]!=0){ // Row
                            if(set.contains(grid[i][k])){
                                set.remove(grid[i][k]);
                            }
                        }
                        if(grid[k][j]!=0) { // Column
                            if(set.contains(grid[k][j])){
                                set.remove(grid[k][j]);
                            }
                        }
                    }
                    setLimits(getBlockNumber(i,j));
                    for(int m = ldi; m <= lui; m++){ // Block
                        for(int n = ldj; n <= luj; n++){
                            if(grid[m][n]!=0){
                                if(set.contains(grid[m][n])){
                                    set.remove(grid[m][n]);
                                }
                            }
                        }
                    }
                    possibleValues.put(i + "" + j, set);
                }else
                    total++;
            }
        }
    }

    /**
     * This method is called wheneve a value is found
     * It updates all the possible values for each cell
     * @param grid sudoko board
     * @param i first index where the value was added
     * @param j second index where the value was added
     * @param k value added
     */
    static void updatePossibleValues(int[][] grid, int i, int j, int k){
        for(int m = 0; m < 9; m++){
            if(grid[i][m] == 0){ // Row
                Set<Integer> temp = possibleValues.get(i+""+m);
                if(temp.contains(k)){
                    temp.remove(k);
                }
            }
            if(grid[m][j] == 0){ // Column
                Set<Integer> temp = possibleValues.get(m+""+j);
                if(temp.contains(k)){
                    temp.remove(k);
                }
            }
        }
        setLimits(getBlockNumber(i,j));
        for (int m = ldi; m <= lui; m++) { // Block
            for (int n = ldj; n <= luj; n++) {
                if(grid[m][n] == 0){
                    Set<Integer> temp = possibleValues.get(m+""+n);
                    if(temp.contains(k)){
                        temp.remove(k);
                    }
                }
            }
        }
    }

    /**
     * This method looks for the block number given the indexes i and j, example (0,0) is in block 1
     * @param i first index of the grid
     * @param j second index of the grid
     * @return block number
     */
    static int getBlockNumber(int i, int j){
        if(i<=2 && j<=2) {
            return 1;
        }else if(i<=2 && j>2 && j<=5 ) {
            return 2;
        }else if(i<=2 && j>5 && j<=8) {
            return 3;
        }else if(i>2 && i<=5 && j<=2) {
            return 4;
        }else if(i>2 && i<=5 && j>2 && j<=5) {
            return 5;
        }else if(i>2 && i<=5 && j>5 && j<=8) {
            return 6;
        }else if(i>5 && i<=8 && j<=2) {
            return 7;
        }else if(i>5 && i<=8 && j>2 && j<=5) {
            return 8;
        }else if(i>5 && i<=8 && j>5 && j<=8) {
            return 9;
        }else{
            return 0;
        }
    }

    /**
     * This method changes the limits for searching a block
     * @param block number used to establish the limits
     */
    static void setLimits(int block){
        switch (block) {
            case 1: ldi=0; lui=2; ldj=0; luj=2;
                break;
            case 2: ldi=0; lui=2; ldj=3; luj=5;
                break;
            case 3: ldi=0; lui=2; ldj=6; luj=8;
                break;
            case 4: ldi=3; lui=5; ldj=0; luj=2;
                break;
            case 5: ldi=3; lui=5; ldj=3; luj=5;
                break;
            case 6: ldi=3; lui=5; ldj=6; luj=8;
                break;
            case 7: ldi=6; lui=8; ldj=0; luj=2;
                break;
            case 8: ldi=6; lui=8; ldj=3; luj=5;
                break;
            case 9: ldi=6; lui=8; ldj=6; luj=8;
                break;
        }
    }

    /**
     * This methods prints to STDOUT the sudoku board
     * @param grid sudoku board
     */
    static void printGrid(int [][] grid){
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 8){
                    System.out.print(grid[i][j]);
                }else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * This method prints the content of the sets of each empty cell
     * @param grid sudoku board
     */
    static void printPossibleValues(int[][] grid){
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(grid[i][j]== 0){
                    out.print("PV of ("+i+","+j+") = ");
                    for(Integer e: possibleValues.get(i+""+j))
                        out.print(e);
                    out.println("");
                }
            }
        }
    }

    /**
     * Main method of the program
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int board[][] = new int[9][9];
        n = in.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 9; j++) {
                for(int k = 0; k < 9; k++) {
                    board[j][k] = in.nextInt();
                }
            }
            while(!sudoku_solve(board));
        }
    }
}