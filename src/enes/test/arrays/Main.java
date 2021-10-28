package enes.test.arrays;

import java.io.Serial;

public class Main {

    public static void main(String[] args) {

        int[] intArray= {20,35,-15, 7,55,1,-22};
        for(int LastIndex=intArray.length-1;LastIndex>0;LastIndex--){
            for(int i=0;i<LastIndex;i++){
                if(intArray[i]>intArray[i+1])
                    swap(intArray,i,i+1);
            }
        }
        for(int i=0;i<intArray.length;i++)
            System.out.println(intArray[i]);
    }

    public static void swap(int[] array,int i, int j){

        if(i==j)
            return;
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }

}
