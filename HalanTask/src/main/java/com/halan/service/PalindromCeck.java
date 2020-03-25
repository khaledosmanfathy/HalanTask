/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halan.service;

/**
 *
 * @author khaled.osman
 */
public class PalindromCeck {

    public static boolean isPalindrom(String word) {

        // if length is 0 or 1 then String is palindrome
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrom(word.substring(1, word.length() - 1));
        }
        return false;
    }
}
