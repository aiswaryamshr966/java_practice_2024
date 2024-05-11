package com.backtracking;

public class KnightTour {
    public static int N = 8;
    public static void main(String[] args) {
        solveKT();
    }

    /*
    This function solves the Knight Tour problem using BackTracking.
    This function mainly uses solveKTUtil() to solve the problem.
    It returns false if no complete tour is possible, otherwise return true and prints the tour.
    Please note that there may be more than one solution, this function prints one of the feasible solutions.
    */
    private static boolean solveKT() {
        int solution[][] = new int[8][8];

        //Initialisation of solution matrix
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++){
                solution[x][y]=-1;
            }
        }

        //xMove[] and yMove[] define next move of the Knight
        //xMove[] is for the value of the x-coordinate
        //yMove[] is for the value of the y-coordinate
        int xMove[] = {2,1,-1,-2,-2,-1,1,2};
        int yMove[] = {1,2,2,1,-1,-2,-2,-1};

        //since the Knight is initially at the first block
        solution[0][0] = 0;

        //Start from 0,0 and explore all tours using solveKTUtils()
        if (!solveKTUtils(0,0,1,solution,xMove,yMove)){
            System.out.println("Solution Doesn't Exist");
            return false;
        }else printSolution(solution);

        return true;
    }

    private static void printSolution(int[][] solution) {
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++){
                System.out.print(solution[x][y]+"\t");
            }
            System.out.println();
        }
    }

    //A recursive utility function to solve Knight Tour Problem
    private static boolean solveKTUtils(int i, int i1, int i2, int[][] solution, int[] xMove, int[] yMove) {
        int k, next_x, next_y;
        if (i2==N*N) return true;

        //Try all next moves from the current coordinate x,y
        for (k=0;k<8;k++){
            next_x=i+xMove[k];
            next_y=i1+yMove[k];

            if (isSafe(next_x,next_y,solution)){
                solution[next_x][next_y]=i2;
                if (solveKTUtils(next_x,next_y,i2+1,solution,xMove,yMove)) return true;
                else solution[next_x][next_y]=-1; //BackTracking
            }
        }
        return false;
    }

    private static boolean isSafe(int nextX, int nextY, int[][] solution) {
        return (nextX>=0&&nextX<N&&nextY>=0&&nextY<N&&solution[nextX][nextY]==-1);
    }
}
