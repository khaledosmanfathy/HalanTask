/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halan.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author khaled.osman
 */
public class IndexOfFirstDuplicate {

    public static void IndexOfFirstDuplicate(int[] elements) {

        int index = -1;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = elements.length - 1; i >= 0; i--) {
            if (hashSet.contains(elements[i])) {
                index = i;
            } else {
                hashSet.add(elements[i]);
            }
        }

        System.out.println(findIndex(elements, elements[index]));

    }

    public static int findIndex(int arr[], int t) {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
}
