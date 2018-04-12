package education.Disciple;

import education.EducationalInstitute.EducationalInstitute;

public class Disciple {

    private String name;
    private String secondName;
    private String middleName;
    private Sex sex;
    private int age;
    private EducationalInstitute educationalInstitute;

    Disciple(String name, String secondName, String middleName, Sex sex, int age, EducationalInstitute educationalInstitute) {
        this.name = name;
        this.secondName = secondName;
        this.middleName = middleName;
        this.sex = sex;
        this.age = age;
        this.educationalInstitute = educationalInstitute;
    }

    Disciple(String name, String secondName, String middleName, EducationalInstitute educationalInstitute) {
        this.name = name;
        this.secondName = secondName;
        this.middleName = middleName;
        this.educationalInstitute = educationalInstitute;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getEducationalInstituteInfo() {
        return educationalInstitute.getEducationalInstituteInfo();
    }

    public String getInfo() {
        return "имя " +name +" фамилия " +secondName +" отчество " +middleName +" пол " +sex.toString() +" возраст " +age;
    }
}
