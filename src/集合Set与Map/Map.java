package 集合Set与Map;

public interface Map<K, V> {
    void add(K key, V val);

    boolean contains(K key);

    V get(K key);

    void set(K key, V newValue);

    V remove(K key);

    int getSize();

    boolean isEmpty();
}
