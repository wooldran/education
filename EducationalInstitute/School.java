package education.EducationalInstitute;

public class School extends EducationalInstitute{
    private int classNum;
    private String classLetter;

    public School(int classNum, String classLetter) {
        this.classNum = classNum;
        this.classLetter = classLetter;
    }
    public School(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String getEducationalInstituteInfo() {
        return " школьный класс " +classNum + classLetter;
    }
}
