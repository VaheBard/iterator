package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int bound, min;

    public Randoms(int min, int max) {
        bound = max - min + 1;
        this.min = min;
        random = new Random();
    }

    protected int getIndex() {
        return random.nextInt(bound) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getIndex();
            }
        };
    }
}
