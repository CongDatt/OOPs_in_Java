public class circle {
    private double radius;

    public void Circle(double radius){
        this.radius = radius;
    }
    public double GetArea(){
        return 3.14 * radius * radius;
    }

    public double GetChuVi(){
        return 2 * 3.14 *radius;
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 2.3;
        System.out.println("Dien tich hinh tron nay la : "+ c.GetArea());
        System.out.println("Chu vi hinh tron nay la : "+ c.GetChuVi());
    }
}
