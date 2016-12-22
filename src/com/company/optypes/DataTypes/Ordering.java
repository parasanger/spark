package com.company.optypes.DataTypes;


/**
 * Created by rogerwarner on 12/22/16.
 */
public interface Ordering extends Comparable {

    /**
     * given two args and an Op whois of greater or lesser precedence
     * @param a
     * @param b
     * @return
     */
    int findPrecidence(Type a, Type b);
}
