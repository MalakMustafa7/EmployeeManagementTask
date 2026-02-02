package org.example.enumuration;

public enum Department {
    IT("IT"),
    HR("Human Resource"),
    SALES("Sales"),
    FINANCE("Finance"),
    SUPPORT("Customer Support");



    private final String displayName;

    Department(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
