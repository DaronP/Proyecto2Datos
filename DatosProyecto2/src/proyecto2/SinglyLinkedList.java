public class SinglyLinkedList<E> implements LinkedList<E> {

    /*
    Use keyword static in order to strip the implicit reference to an instance
    of SinglyLinkedList and save space.
    */
    private static class Node<E> {

        public Node<E> next;
        public E element;

        public Node(final E element) {
            this.element = element;
        }

        public Node (final E element, final Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setElement(final E element) {
            this.element = element;
        }

        public void setNext(final Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    /*
     * Don't you ever reveal the implementation details. ;-)
     */
    private Node<E> head;
    private Node<E> tail;
    private int size;    

    @Override
    public E get(final int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        Node<E> singly = head;

        for (int i = 0; i < index; i ++) {
            singly = singly.getNext();      
        }

        return singly.getElement(); 
    }

    @Override
    public void add(final E element) {
        Node<E> singlyAdd = new Node<>(element);

        if (tail == null) {
            head = singlyAdd;
            tail = singlyAdd;
        } else {
            tail.setNext(singlyAdd);
            tail = singlyAdd;
        }     

        size++;
    }

    /*
     * Your add(int, E) was broken. Not anymore.
     */
    @Override
    public boolean add(final int index, final E data) {
        if (index < 0 || index > size()) {
            return false;      
        } 

        Node<E> newNode = new Node<>(data);
        Node<E> prev = null;
        Node<E> singly = head;

        for (int i = 0; i < index; i++) {
            prev = singly;
            singly = singly.getNext();
        }

        if (singly == null) {
            // Append to the tail.
            tail.setNext(newNode);
            tail = newNode;
        } else {
            if (singly == head) {
                newNode.setNext(head);
                head = newNode;
            } else {
                prev.setNext(newNode);
                newNode.setNext(singly);
            }
        }

        ++size;
        return true;
    }   

    public void display() {
        System.out.print("[");

        int i = 0;
        Node<E> current = head;

        while (current != null) {
            System.out.print(current.toString() + (i < size - 1 ? ", " : ""));
            current = current.getNext();
            ++i;
        }

        System.out.println("]");
    }

    @Override
    public boolean contains(E data) {
        if (head == null) {
            return false;
        }

        Node<E> node = head;

        while (node != null) {
            if (node.getElement().equals(data)) {
                return true;
            }

            node = node.getNext();
        }

        return false;         
    }       

    /*
     This is a really good idea to handle the special case of the removal 
     routine.
    */
    private Node<E> removeFirst() {
        if (size() == 0) {
            throw new IllegalStateException("Removing from an empty list.");
        }    

        Node<E> singly = head;            
        head = head.getNext();
        singly.setNext(null);
        --size;
        return singly;     
    } 

    /*
    This one is cool also.
    */
    private Node<E> removeLast() {
        if (size() == 0) {
            throw new IllegalStateException("Removing from an empty list.");
        }    

        if (size() == 1) {
            final Node<E> last = tail;
            size = 0;
            head = null;
            tail = null;
            return last;
        }

        Node<E> target = head;
        Node<E> prev = null;

        for (int i = 0; i < size() - 1; ++i) {
            prev = target;
            target = target.getNext();
        }

        prev.setNext(null);
        tail = prev;
        return target;
    }       

    @Override
    public E remove(int index) {      
        E hold = get(index);     

        if (index < 0 || index >= size()) {
            return null;
        }

        if (index == 0) {
            return removeFirst().getElement();
        }

        if (index == size() - 1) {
            return removeLast().getElement();
        }

        Node<E> prev = null;
        Node<E> current = head;

        for (int i = 0; i < index; i++) {   
            prev = current;
            current = current.getNext();
        }  

        prev.setNext(current.getNext());
        --size; 
        return hold;     
    }       

    /*
    What's the point to delegate to getTotal?
    */
    @Override
    public int size() {
        return size;
    }             

    /*
    Just nullify all the references and the garbage collector will do its work.
    */
    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }
}