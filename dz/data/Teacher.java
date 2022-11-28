package OOP_sem2.dz.data;

public class Teacher extends User {
    private String disciplesTaught;

    public Teacher(String disciplesTaught, String name, String birthday) {
        super.setName(name);
        super.setBirthday(birthday);
        this.disciplesTaught = disciplesTaught;
    }


    public String getDisciplesTaught() {
        return disciplesTaught;
    }

    public void setDisciplesTaught(String disciplesTaught) {
        this.disciplesTaught = disciplesTaught;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Name=" + super.getName() +
                "Birthday=" + super.getBirthday() +
                "disciplesTaught='" + disciplesTaught + '\'' +
                '}';
    }
}
