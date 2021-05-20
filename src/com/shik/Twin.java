package com.shik;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(presentState, symbol);
    }

    @Override
    public String toString() {
        return "Twin{" +
                "presentState='" + presentState + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
