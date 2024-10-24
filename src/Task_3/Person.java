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
        if (name.length() > 1) {
            this.name = name;
        }
        else{
            System.out.println("prøv at skriv et længere navn");
        }
    }

    //3.2
    public abstract boolean addCourse(String course);


}
