package org.example.DogNamesStreams;

public class Dogs {

    private final String dogName;

    public Dogs(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "dogName='" + dogName + '\'' +
                '}';
    }
}
