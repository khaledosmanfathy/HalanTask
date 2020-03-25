/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halan.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author khaled.osman
 */
public class UniquePattern {

    public static void Unique(String[] elements) {

        Map<String, Integer> nameAndCount = new HashMap<>();

        for (String element : elements) {
            Integer count = nameAndCount.get(element);
            if (count == null) {
                nameAndCount.put(element, 1);
            } else {
                nameAndCount.put(element, ++count);
            }
        }

        Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        for (Entry<String, Integer> entry : entrySet) {

            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }

    }
}
