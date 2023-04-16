package org.example.Streams;

public class People {
    private final String personName;
    private final String personCareer;
    private final String personState;

    public People(String personName, String personCareer, String personStatus) {
        this.personName = personName;
        this.personCareer = personCareer;
        this.personState = personStatus;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonCareer() {
        return personCareer;
    }

    public String getPersonState() {
        return personState;
    }

    @Override
    public String toString() {
        return "Person Name ='" + personName + '\'' +
                ", Person Career ='" + personCareer + '\'' +
                ", Person State ='" + personState +
                "'";
    }
}
