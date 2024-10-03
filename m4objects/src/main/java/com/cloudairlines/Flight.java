package com.cloudairlines;


public record Flight(String fromDest, String toDest, String date) {

    public Flight {
        if (fromDest == null || toDest == null || date == null) {
            throw new IllegalArgumentException("Invalid flight details");
        }
    }

}
