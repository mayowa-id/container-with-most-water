package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Solution mySol = new Solution();
            int [] heights = {5,7,5,4,3,2,1,9,6};
            System.out.println(mySol.findMaxArea(heights));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bounds");
        }

    }
}