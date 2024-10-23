package Task_3;

import java.util.ArrayList;

// 3.2
public class Student extends Person {
    //3.3
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;
    // 3.3
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }
    public void addCurrentCourses(String course) {
        this.currentCourses.add(course);
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }

    public void setPassedCourses(ArrayList<String> passedCourses) {
        this.passedCourses = passedCourses;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }

    // 3.4 // IKKE sikker på det er rigtigt
    @Override
    public boolean addCourse(String course) {
        return false;
    }
}
