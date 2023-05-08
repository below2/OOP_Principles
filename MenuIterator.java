// Andrew Rosscoe
// Brendan Benlolo
// COSC436-002
// 04/12/2023
public interface MenuIterator {

    // returns true if items of appropriate type left in list
    boolean hasNext();

    // returns current item and advances to next item
    MenuItem next();
}