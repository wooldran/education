package education.Disciple;

import education.EducationalInstitute.University;

public class Student extends Disciple {

    public Student(String name, String secondName, String middleName, Sex sex, int age, University university) {
        super(name, secondName, middleName, sex, age, university);
    }

    public Student(String name, String secondName, String middleName, University university) {
        super(name, secondName, middleName, university);
    }
}
