package com.dennis;

public class Rectangle implements Shapes{
    int length = 0;
    int height = 0;
    int positionX = 0;
    int positionY = 0;
    String direction = Directions.NORTH.toString();

    public Rectangle(int[] arr){
        this.length = arr[0];
        this.height = arr[1];
        this.positionX = arr[2];
        this.positionY = arr[3];
    }
    @Override
    public int[][] returnRectangle() {
        return new int[length][height];
    }

    @Override
    public int[] canFall(int command, int[][] rectShape) {
        if(positionY >= rectShape.length || positionY < 0){
            return new int[]{-1 ,-1};
        }else if(positionX >= rectShape[positionY].length || positionX < 0){
            return new int[]{-1 ,-1};

        }
        switch (direction) {
            case "NORTH":
                if (command == 1) {
                    positionY = positionY - 1;
                } else if (command == 2) {
                    positionY = positionY + 1;
                } else if (command == 3) {
                    direction = Directions.EAST.toString();
                } else if (command == 4) {
                    direction = Directions.WEST.toString();
                }
                break;
            case "EAST":
                if (command == 1) {
                    positionX = positionX + 1;
                } else if (command == 2) {
                    positionX = positionX - 1;
                } else if (command == 3) {
                    direction = Directions.SOUTH.toString();
                } else if (command == 4) {
                    direction = Directions.NORTH.toString();
                }
                break;
            case "SOUTH":
                if (command == 1) {
                    positionY = positionY + 1;
                } else if (command == 2) {
                    positionY = positionY - 1;
                } else if (command == 3) {
                    direction = Directions.WEST.toString();
                } else if (command == 4) {
                    direction = Directions.EAST.toString();
                }
                break;
            case "WEST":
                if (command == 1) {
                    positionX = positionX - 1;
                } else if (command == 2) {
                    positionX = positionX + 1;
                } else if (command == 3) {
                    direction = Directions.NORTH.toString();
                } else if (command == 4) {
                    direction = Directions.SOUTH.toString();
                }
                break;
        }


        return new int[]{positionX, positionY};
    }
}
