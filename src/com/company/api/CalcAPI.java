package com.company.api;

import com.company.optypes.DataTypes.Op;
import com.sun.source.tree.BinaryTree;
import com.sun.tools.javac.util.Pair;

import java.util.LinkedList;

/**
 * Created by rogerwarner on 12/22/16.
 */
public interface CalcAPI {

    /**
     * Will call the engine with ops.   will be prioritieed.
     *
     * @param tree
     * @return
     */
    <A> A computerThis(BinaryTree tree);


    /**
     * will make static/or companion object to turn string into order of ops pairs.
     * will call engine.Marshall(
     */
    void CalcAPI(String[] parseMe);
}
