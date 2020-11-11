class student{
    String name;
    int age;
    
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

public class test {
    public static void main(String[] args) {
        student st1 = new student();
        st1.name = "Cong Dat";
        st1.age = 20;
        st1.display();
    }
}
// class : dinh nghia thong tin doi tuong can tao 
// object : 1 the hien cua class
// attribute : dac diem co doi tuong
// method : hanh vi, hanh dong cua doi tuong