package Task_3;

import java.util.ArrayList;

//3.2
public abstract class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String>canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }
    // IKKE sikker på det er rigtigt
    @Override
    public boolean addCourse(String course) {
        return false;
    }
}
