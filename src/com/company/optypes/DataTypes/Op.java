package com.company.optypes.DataTypes;

import com.sun.tools.javac.util.Pair;

/**
 * Created by rogerwarner on 12/22/16.
 *
 *
 */
public interface Op {
    <A> A doIt(Pair values);
}
