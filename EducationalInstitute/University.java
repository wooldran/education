package education.EducationalInstitute;

public class University extends EducationalInstitute {
    private String Faculty;
    private String Specialization;
    private int groupNumber;

    public University(String faculty, String specialization, int groupNumber) {
        Faculty = faculty;
        Specialization = specialization;
        this.groupNumber = groupNumber;
    }

    public University(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String getEducationalInstituteInfo() {
        return " факультет " +Faculty + " специальсноть " +Specialization + " номер группы " +groupNumber;
    }
}
