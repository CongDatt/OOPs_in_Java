public class person {
    private String name;
    private int age;
    private String address;
    
    public person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }

    public static void main(String[] args) {
        person a = new person("dat", 20, "10 nguyen huu tho");
        a.display();
    }
}
