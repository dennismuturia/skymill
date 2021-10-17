package com.dennis;

import java.util.Arrays;

public class ShapeCalculator {
    private final Shapes rectangle;
    public ShapeCalculator(int [] arr){
        rectangle = new Rectangle(arr);
    }
    public void calculateLatestPositionRectangle(int p){
        int[][] table = rectangle.returnRectangle();
        int[] res = rectangle.canFall(p, table);
        if(p == 0){
            System.out.println(Arrays.toString(res));
        }
    }
}
