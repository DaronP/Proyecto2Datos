public interface LinkedList<E> {    

    E get(int index);    

    void add(E data);        

    boolean add(int index, E data);      

    boolean contains(E data);    

    E remove(int index);        

    int size();    

    void clear();

}