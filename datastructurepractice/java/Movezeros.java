package com.example.datastructurepractice.java;

public class Movezeros{
    public static void main(String[] args) {
        Movezeros moveZeros = new Movezeros();
        int[] arr = {1,0,3,0,13};
        moveZeros.orderZeros(arr);

    }

    public void orderZeros(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                int zero = i;
                for(int j=zero;j<arr.length;j++){
                    if(arr[j] > 0){
                        swap(arr, j, zero);

                    }
                }
            }    
        } 
    }

    public void swap(int[] arr, int j, int zero){
        int temp = arr[zero];
        arr[zero] = arr[j];
        arr[j] = temp;
    }
}