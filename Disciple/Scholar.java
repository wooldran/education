package education.Disciple;

import education.EducationalInstitute.School;

public class Scholar extends Disciple {

    public Scholar(String name, String secondName, String middleName, Sex sex, int age, School school) {
        super(name, secondName, middleName, sex, age, school);
    }

    public Scholar(String name, String secondName, String middleName, School school) {
        super(name, secondName, middleName, school);
    }

}
