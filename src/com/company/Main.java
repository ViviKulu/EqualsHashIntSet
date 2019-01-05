package com.company;


// Write a method in the HashIntSet class called
// equals that accepts another object as a parameter
// and returns true if the object is another HashIntSet
// that contains exactly the same elements. The internal
// hash table size and ordering of the elements does not
// matter, only the sets of elements themselves.

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashIntSet s1 = new HashIntSet();

        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashIntSet s2 = new HashIntSet();

        s2.add(3);
        s2.add(2);
        s2.add(1);

        System.out.println(s1.equals(s2));
    }

    //  Returns true if o refers to another HashIntSet with the same elementData as this set.
    //    public boolean equals(Object o) {
    //        return equalsIgnoringSize(o) && size == ((HashIntSet) o).size();
    //    }

    // Returns true if o refers to another HashIntSet with the same elementData as this set,
    // ignoring the value of the size field.
    //    public boolean equalsIgnoringSize(Object o) {
    //        if (o instanceof HashIntSet) {
    //            HashIntSet other = (HashIntSet) o;
    //            for (HashIntSet.Node front : elementData) {
    //                HashIntSet.Node current = front;
    //                while (current != null) {
    //                    if (!other.contains(current.data)) {
    //                        return false;
    //                    }
    //                    current = current.next;
    //                }
    //            }
    //            for (HashIntSet.Node front : other.elementData) {
    //                HashIntSet.Node current = front;
    //                while (current != null) {
    //                    if (!this.contains(current.data)) {
    //                        return false;
    //                    }
    //                    current = current.next;
    //                }
    //            }
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }
}
