package Task_3;

import java.util.ArrayList;

//3.2
public class Teacher extends Person {
    // 3.3
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    //3.1
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    //3.5
    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        }
            return false;
    }

    public ArrayList<String> getCanTeach() {
        return canTeach;
    }
}

