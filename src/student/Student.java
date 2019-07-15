
package student;


public class Student {

    public Student() {
    }

    private String name="noname";
    private String faculty="XXX";
    private int course=1;
    private boolean session=false;

    public Student(String name, String faculty, int course) {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
    }

    public Student(String name, boolean session) {
        this.name=name;
        this.session = session;
    }

    public Student(String name, String faculty, int course, boolean session) {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.session = session;
    }

    public void gotostudy(){
        
        System.out.println(getName() + "Go to study");
    }
    
    public void gotocourses(){
        System.out.println(getName() + "Go to courses " + getFaculty());
    }
    
    public void gotosession(){
        System.out.println(getName() + "Go to session " + isSession());
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFuculty(String fuculty) {
        this.faculty = fuculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isSession() {
        return session;
    }

    public void setSession(boolean session) {
        this.session = session;
    }
    
    

    
    

}
