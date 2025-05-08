public class Employee {

    double hoursWorked;
    double startTime;

    public double getHoursWorked() {
        return hoursWorked;
    }

    void punchIn(@SuppressWarnings("SameParameterValue") double time) {
        this.startTime = time;
    }

    void punchOut(double time) {
        if(time < this.startTime) {
            hoursWorked += time - this.startTime + 24;
        }
        else {
            hoursWorked += time - this.startTime;
        }
    }
}
