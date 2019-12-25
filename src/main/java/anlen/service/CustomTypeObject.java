package anlen.service;

import org.springframework.stereotype.Service;

@Service
public class CustomTypeObject<T extends Comparable<T>> {
    private T value;

    public void add(T item){
        value = item;
    }

    public T get(){
        return value;
    }
}
