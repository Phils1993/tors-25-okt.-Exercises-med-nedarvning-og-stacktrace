package Task_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 3.6

        // kan ikke bestå
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Java");
        passedCourses1.add("C#");
        passedCourses1.add("Python");

        // kan godt bestå
        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("English");
        passedCourses2.add("Spanish");
        passedCourses2.add("Java 1.0");
        passedCourses2.add("Franch");

        // kan godt bestå
        ArrayList<String> passedCourses3 = new ArrayList<>();
        passedCourses3.add("Java 1.0");
        passedCourses3.add("English");
        passedCourses3.add("Spanish");

        // kan godt undervise
        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Java");
        canTeach1.add("C#");
        canTeach1.add("Java 1.0");

        // kan IKKE undervise
        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("English");
        canTeach2.add("Java");
        canTeach2.add("Franch");

        // kan godt undervise
        ArrayList<String> canTeach3 = new ArrayList<>();
        canTeach3.add("Java 1.0");
        canTeach3.add("C#");
        canTeach3.add("Java");

        //3.7
        ArrayList<Person> Persons = new ArrayList<>();
        Student s1 = new Student(" Mikkel ", passedCourses1);
        Student s2 = new Student(" Philip ", passedCourses2);
        Student s3 = new Student(" Benjamin ", passedCourses3);
        Teacher t1 = new Teacher(" Signe ", canTeach1); // burde kunne undervise i output
        Teacher t2 = new Teacher(" Tine ", canTeach2); // kan ikke undervise
        Teacher t3 = new Teacher(" Tess ", canTeach3); // burde kunne undervise i output

        // tilføjer til arrayet persons
        Persons.add(s1);
        Persons.add(s2);
        Persons.add(s3);

        Persons.add(t1);
        Persons.add(t2);
        Persons.add(t3);


        // 3.7
        for (Person p : Persons) {
            if(p instanceof Student s) {
                if(s.getPassedCourses().contains("Java 1.0")){
                    System.out.println(s.getName() + "Har bestået kurset.");
                }
                else {
                    System.out.println(s.getName() + "har endnu ikke bestået kurset. ");
                }
            }
            if(p instanceof Teacher t) {
                if( t.getCanTeach().contains("Java 1.0")){
                    System.out.println(t.getName() + "kan godt undervise i dette fag. ");
                } else {
                    System.out.println(t.getName() + "kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
