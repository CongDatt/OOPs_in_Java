
public class encapsulation {
    private int id;
    private String name;
    private int age;
    private String address;
    
    // tinh dong : getter va setter
    // get
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    // Set
    public void setName( String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        e.setId(51800183);
        e.setName("Tran Cong Dat");
        e.setAge(20);
        e.setAddress("19 nguyen huu tho");
        System.out.println("Student : "+ e.getName());
        System.out.println("ID : " +e.getId());
        System.out.println("Tuoi : "+e.getAge());
        System.out.println("Dia chi : "+e.getAddress());
    }

}
