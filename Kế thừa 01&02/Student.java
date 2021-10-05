public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * student.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        String res = "Student[" + super.toString();
        res += ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
        return res;
    }
}
