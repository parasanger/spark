package com.company.optypes.DataTypes;

/**
 * Created by rogerwarner on 12/22/16.
 *
 * On for each datatype
 */
public interface Operand {
    <A> A doMath(Type A, Type B);
}
