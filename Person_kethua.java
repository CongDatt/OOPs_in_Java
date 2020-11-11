public class Person_kethua {
    private String name;
    private int dob;

    public Person_kethua(String name, int dob){
        this.name = name;
        this.dob = dob;
    }
    public int getDob() {
        return dob;
    }
    public String getName() {
        return name;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Studentt s = new Studentt("Dat",2000,9);
        System.out.println("Name : "+s.getName());
        System.out.println("Age : "+s.getDob());
        System.out.println("GPA : "+s.getGpa());
    }
}

class Studentt extends Person_kethua{
    private int gpa;

    public Studentt(String name, int dob, int gpa){
        super(name, dob);
        this.gpa = gpa;
    }
    public int getGpa() {
        return gpa;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
