/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halan.service;

import java.util.Scanner;

/**
 *
 * @author khaled.osman
 */
public class TransposeMatrix {

    public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Enter Matrix Data");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static int[][] printMatrix(int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Your Matrix is : ");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();

        }
        return matrix;
    }

    public static void transpose(int A[][], int B[][], int matirxSize) {
         System.out.println("Your Transposed Matrix is : ");
        int i, j;
        for (i = 0; i < matirxSize; i++) {
            for (j = 0; j < matirxSize; j++) {
                B[i][j] = A[j][i];
            }
        }
        for (i = 0; i < matirxSize; i++) {
            for (j = 0; j < matirxSize; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
