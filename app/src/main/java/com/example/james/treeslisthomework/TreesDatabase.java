package com.example.james.treeslisthomework;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by james on 05/07/2017.
 */

public class TreesDatabase {

    public static ArrayList<Tree> getTrees(){
        final ArrayList<Tree>trees = new ArrayList<>();
        trees.add(new Tree("Ashbrittle Yew", 4_000, "United Kingdom"));
        trees.add(new Tree("General Sherman", 2_000, "USA"));
        trees.add(new Tree("Jaya Sri Maha Bodhi", 2_247, "India"));
        trees.add(new Tree("Major Oak", 1_000, "United Kingdom"));
        trees.add(new Tree("The Sunland Baobab", 6_000, "South Africa"));
        trees.add(new Tree("Hyperion", 600, "USA"));
        trees.add(new Tree("Hangman's Elm", 300, "USA"));
        trees.add(new Tree("Methuselah", 5_000, "USA"));
        trees.add(new Tree("Old Tjikko", 9_550, "Norway"));
        trees.add(new Tree("Arbol Del Tule El", 2_000, "Mexico"));
        trees.add(new Tree("Thimmamma Marrimanu", 200, "India"));
        trees.add(new Tree("Hardy Tree", 163, "United Kingdom"));
        return trees;
    }
}
