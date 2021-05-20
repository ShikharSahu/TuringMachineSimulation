package com.shik;
import java.util.Objects;
// a class to act as a conatainer for values for their easy transfer
public class Twin {
    private String presentState,symbol;
    public Twin(String presentState, String symbol ){
        this.presentState = presentState;
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Twin twin = (Twin) o;
        return Objects.equals(presentState, twin.presentState) && Objects.equals(symbol, twin.symbol);
    }

    // so that in the hash map, the objects with the same contents will map to the same keys
    @Override
    public int hashCode() {
        return Objects.hash(presentState, symbol);
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Twin{" +
                "presentState='" + presentState + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
