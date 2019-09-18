package AbstractionAndInterface;

import java.awt.*;
import java.util.Arrays;

public class DemoGeneric<T> {
    private T first;
    private T second;

    public DemoGeneric(T first, T second){
        this.first= first;
        this.second= second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}
