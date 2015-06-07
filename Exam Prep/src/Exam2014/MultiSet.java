package Exam2014;

interface MultiSet {
    // returns the size of the Exam2014.MultiSet
    int size();
    // Return true if s is in the Exam2014.MultiSet
    boolean contains(String s);
    // Return the number of occurrences of s in the Exam2014.MultiSet
    int occurrences(String s);
    // Add a new item s to the Exam2014.MultiSet
    void add(String s);
    // Remove an item s from the Exam2014.MultiSet
    // If s is not present in the Exam2014.MultiSet, return false.
    // If s is present with count 1, remove s from the Exam2014.MultiSet.
    // If s is present with count > 1, reduce the count by 1.
    // If s was present return true.
    boolean remove(String s);
}