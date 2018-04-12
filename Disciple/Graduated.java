package education.Disciple;

import education.EducationalInstitute.University;

public class Graduated extends Disciple{

    private String scinceWorkName;
    private String sceinceCooperator;

    public Graduated(String name, String secondName, String middleName, Sex sex,
                     int age, String scinceWorkName, String sceinceCooperator, University university) {
        super(name, secondName, middleName, sex, age, university);
        this.scinceWorkName = scinceWorkName;
        this.sceinceCooperator = sceinceCooperator;
    }

    public Graduated(String name, String secondName, String middleName, String sceinceCooperator, University university) {
        super(name, secondName, middleName, university);
        this.sceinceCooperator = sceinceCooperator;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +" научная работа " +scinceWorkName +" научный сотрудник " +sceinceCooperator;
    }
}
