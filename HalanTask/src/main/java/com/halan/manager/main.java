/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halan.manager;

import com.halan.service.PalindromCeck;
import java.util.Scanner;
import static com.halan.service.RunLengthEncoding.runLengthEncode;
import static com.halan.service.RunLengthEncoding.runLengthDecode;
import static com.halan.service.TransposeMatrix.enterMatrixData;
import static com.halan.service.TransposeMatrix.printMatrix;
import static com.halan.service.TransposeMatrix.transpose;
import static com.halan.service.UniquePattern.Unique;
import static com.halan.service.IndexOfFirstDuplicate.IndexOfFirstDuplicate;

/**
 *
 * @author khaled.osman
 */
public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for palindrom problem or 2 for encoding/decoding problem or"
                + " 3 for Unique Problem or 4 for Matrix Transpose or 5 for index_of_first_duplicate problem:");
        String input = scanner.nextLine();
        if ("1".equals(input)) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the String for check:");
            String word = scanner2.nextLine();
            if (PalindromCeck.isPalindrom(word)) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is not a palindrome");
            }
        } else if ("2".equals(input)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The Number Of Matrix Rows");
            String encodeInput = scan.nextLine();
            System.out.println(runLengthEncode(encodeInput));
            System.out.print("\n");
            System.out.println("Enter The Number Of Matrix Rows");
            String decodeInput = scan.nextLine();
            System.out.println(runLengthDecode(decodeInput));
        } else if ("3".equals(input)) {
            String[] elements = {"apples", "oranges", "flowers", "apples", "apples"};
            Unique(elements);
        } else if ("4".equals(input)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The Number Of Matrix Rows");
            int matrixRow = scan.nextInt();
            System.out.println("Enter The Number Of Matrix Columns");
            int matrixCol = scan.nextInt();
            System.out.println("Enter The Number Of Matrix Size");
            int size = scan.nextInt();
            int[][] matrixA = new int[matrixRow][matrixCol];
            enterMatrixData(scan, matrixA, matrixRow, matrixCol);
            printMatrix(matrixA, matrixRow, matrixCol);
            int[][] matrixB = new int[matrixRow][matrixCol];
            transpose(matrixA, matrixB, size);
        } else if ("5".equals(input)) {
            int[] elements = {5, 17, 3, 17, 4, -1};
            IndexOfFirstDuplicate(elements);
        }

    }
}

//Q2
/*
mv original.text changed.text
 */

//Q7
/*
1- Fill container A
2- Empty Container A into container B (will be a 2 litters left in Container A)
3- Empty Container B from all water.
4- Empty Container A Again into container B (Container B will be Full with 3 Liters and A has only 1 Liter)
5- Empty Conntainer B into Container A.
 */
