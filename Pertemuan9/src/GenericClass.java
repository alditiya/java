import java.util.ArrayList;

public class GenericClass<E> {
    ArrayList<E> list = new ArrayList<E>();
    
    public void push(E e) {
        list.add(e);
    }
    public int getSize() {
        return list.size();
    }

    public E pop() {
        E e = list.get(getSize() - 1);
        list.remove(getSize() - 1);

        return e;
    }
    
}
