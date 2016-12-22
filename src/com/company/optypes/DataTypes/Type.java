package com.company.optypes.DataTypes;

import java.util.LinkedList;

/**
 * Created by rogerwarner on 12/22/16.
 */

/**
 * all operators will have definition class which knows how to doIt for that Type
 * the concrede data types are of the usual java primitive types.
 *
 * The type enum is a work in progress to have some idea of what all the times are, be able to dispatch to them
 * and to be extensible so other librariers could add more type.
 */
public interface Type {
    LinkedList<String> typeEnum = new LinkedList<>();

    static void init(String newType) {
        typeEnum.add(newType);

    }
}
