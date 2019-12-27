package com.company;

public enum Math {
    SUM{
        public int action(int a, int b){
            return a+b;
        }
    },
    MULTIPLY{
        public int action(int a, int b) {
            return a*b;
        }
    };

    public abstract int action(int a, int b);
}
