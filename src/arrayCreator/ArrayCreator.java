package arrayCreator;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class ArrayCreator {
    public static<T> T[] create(int length, T item){
        T[] array = (T[]) Array.newInstance(item.getClass(), length);

        for(int i = 0; i < array.length; i++){
            array[i] = item;
        }

        return array;
    }

    public  static<T> T[] create(int length, T item, Class<T> c1){
        T[] array = (T[]) Array.newInstance(c1, length);

        for(int i = 0; i < array.length; i++){
            array[i] = item;
        }

        return array;
    }
}
