

public interface ICollection {
    boolean add(String element);
    boolean addAt(String element, int index);
    boolean removeAt(int index);
    boolean removeEl(String element);
    void clear();
    int getSize();
    boolean isPresent(int value);
    int [] getCopy(int start, int end);
    int getElementAt(int index);
    int findFirst(int value);
    int findLast(int value);
}