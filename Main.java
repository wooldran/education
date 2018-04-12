package education;

import education.EducationalInstitute.School;
import education.EducationalInstitute.University;
import education.Сontroller.WriterInfo;
import education.Disciple.*;

public class Main {

    public static void main(String[] args) {

        Student Aaron =  new Student("Aaron", "Ramsey", "Vladimirovich", Sex.male, 19, new University(122404));

        Scholar Madley = new Scholar("Madley", "Beach", "Ivanova", Sex.female, 14, new School(4));

        Graduated Ilita = new Graduated("Ilita", "Zhizni", "Dealwithitovich", Sex.male, 22,
                "Квантовый излучатель флуктуаций", "Пупкин", new University("Научный", "Научная", 122301));

        new WriterInfo(Aaron).showInfo();
        new WriterInfo(Madley).showInfo();
        new WriterInfo(Ilita).showInfo();

    }
}
