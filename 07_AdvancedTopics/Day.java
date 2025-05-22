// Day.java
// Enum representing days of the week with associated numeric values

public enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int dayNumber;

    // Constructor for assigning numeric value to each day
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Getter method for the numeric value
    public int getDayNumber() {
        return this.dayNumber;
    }
}
