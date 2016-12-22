package com.company.optypes.DataTypes;

import com.sun.tools.javac.util.Pair;

/**
 * Created by rogerwarner on 12/22/16.
 *
 *
 */
public class IntegerType implements Operand, Type {

    public String alias = "+";

    public IntegerType(Pair) {};

    Type doMath(Type left, Type r);
}
