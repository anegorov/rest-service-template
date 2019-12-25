package anlen.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomTypeCollection<K,V> {

    Map<K,V> data = new HashMap<>();

    public void add(K key, V val){
        data.put(key, val);
    }

}
