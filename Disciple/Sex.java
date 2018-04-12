package education.Disciple;

public enum Sex {

    male, female;

    @Override
    public String toString() {
        if (this.equals(Sex.male)) {
            return "мальчик";
        } else {
            return "девочка";
        }
    }
}
