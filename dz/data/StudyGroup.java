package OOP_sem2.dz.data;

import OOP_sem2.dz.util.StudyGrupIterator;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup extends StudyGrupIterator {
    protected Teacher groupTeacher;
    protected List<User> studentsList;

    public StudyGroup(Teacher groupTeacher, List<User> studentsList) {
        this.groupTeacher = groupTeacher;
        this.studentsList = studentsList;
    }

    public StudyGroup(Teacher groupTeacher) {

        this(groupTeacher,new ArrayList<>());
    }

    public StudyGroup() {
        this(new Teacher("","",""));
    }


    public void changeTeacher(Teacher teacher){
        this.groupTeacher = teacher;
    }

    public void addStudent(Student student) {
        if (!studentsList.contains(student)) {
            studentsList.add(student);
        }
    }

    public void removeStudent(Student student) {
        if (studentsList.contains(student)) {
            studentsList.remove(student);
        }
    }

    public Teacher getGroupTeacher() {
        return groupTeacher;
    }

    public List<User> getStudentsList() {
        return studentsList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" + groupTeacher +
                ", Students=" + studentsList +
                '}';
    }

    @Override
    public boolean hasNext() {
        return (super.userId < studentsList.size());

    }

    @Override
    public User next() {
        super.userId++;
        System.out.println(userId);
        return studentsList.get(super.userId);
    }
}