package org.example.Streams;

public class People {
    private final String personName;
    private final String personCareer;
    private final EmploymentStatus personStatus;

    public People(String personName, String personCareer, EmploymentStatus personStatus) {
        this.personName = personName;
        this.personCareer = personCareer;
        this.personStatus = personStatus;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonCareer() {
        return personCareer;
    }

    public EmploymentStatus getPersonStatus() {
        return personStatus;
    }

    @Override
    public String toString() {
        return "People{" +
                "Person Name='" + personName + '\'' +
                ", Person Career='" + personCareer + '\'' +
                ", Person Status=" + personStatus +
                '}';
    }
}
