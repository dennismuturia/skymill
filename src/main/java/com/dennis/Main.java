package com.dennis;

import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Please enter th size of the rectangle and the position and the commands eg: 4 4 2 2 * * * *");
        int i = 0;
        int p = 0;
        int[] shape = new int[4];
        ShapeCalculator shapeCalculator = null;
        while(scanner.hasNext()){
            p = scanner.nextInt();
            if(i < shape.length){
                shape[i] = p;
            }
            if(i== shape.length){
                shapeCalculator = new ShapeCalculator(shape);
            }if(i >= shape.length){
                assert shapeCalculator != null;
                shapeCalculator.calculateLatestPositionRectangle(p);
                if(p == 0){
                    break;
                }
            }
            i+=1;
        }
    }
}
