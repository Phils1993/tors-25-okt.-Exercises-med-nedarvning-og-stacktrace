package Task_3;

import java.util.ArrayList;
import java.util.Objects;

// 3.2
public class Student extends Person {
    // 3.3
    private ArrayList<String> passedCourses = new ArrayList<>();
    private ArrayList<String> currentCourses = new ArrayList<>();

    // 3.2
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    // 3.4
    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else currentCourses.add(course);
        return true;
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }

}
