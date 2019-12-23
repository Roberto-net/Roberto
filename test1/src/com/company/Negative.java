package com.company;

public class Negative {
    public static void main(String[] args) {
        int [] [] neg= {{1,4,5,8,-6},
                        {-2,44,8,-8,-37},
                        {-3,-44,-31,-46,-67,55,91,1},
                        {21,34,-5,8}
        };
        for (int i =0; i<neg.length;i++){
            for(int j = 0;j<neg[i].length;j++)
                if (neg [i][j]<0)
                    neg[i][j]=0;
        }
        for (int i =0; i<neg.length;i++){
            for(int j = 0;j<neg[i].length;j++){
                System.out.print(neg [i] [j] + " ");
            }
            System.out.println();
        }



    }
}
