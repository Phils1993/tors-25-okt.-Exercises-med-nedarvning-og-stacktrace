package Task_3;

// 3.1
public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean addCourse(String course);

}
