import java.util.ArrayList;


public class Person {
    private String name;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;


    }
    boolean addCourse(String course)
    {
        return true;
    }
}
class Student extends Person
{
    ArrayList<String> passedCourses = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();


    @Override
    boolean addCourse(String course) {
        passedCourses.add("bio");
        boolean isItPassed = false;
        for(int i = 0; i < passedCourses.size(); i++) {

        if(course == passedCourses.get(i) && course == currentCourses.get(i)){
            System.out.println(passedCourses.get(i));
            isItPassed = true;
        }
        }
        if(isItPassed == true) {
            System.out.println("Already taken/taking the course");

        }
        else if(isItPassed == false) {
            currentCourses.add(course);
            System.out.println("Did not already have the course");
        }
        else{
            System.out.println("BAD");
        }
        for(int i = 0; i < passedCourses.size(); i++) {
            System.out.println(passedCourses.get(i));
        }
        return isItPassed;
    }

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

}
class Teacher extends Person {
    @Override
    boolean addCourse(String course) {
        return true;

    }


    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    ArrayList<String> canTeach = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("s1");
        s1.addCourse("cia");
        s1.addCourse("cia");

    }
}

