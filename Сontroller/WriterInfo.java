package education.Сontroller;

import education.Disciple.Disciple;

public class WriterInfo {
    Disciple disciple;

    public WriterInfo(Disciple disciple) {
        this.disciple = disciple;
    }

    public void showInfo() {
        System.out.println(disciple.getInfo() +disciple.getEducationalInstituteInfo());
    }
}
