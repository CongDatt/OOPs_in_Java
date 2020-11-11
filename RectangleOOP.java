import java.util.Scanner;

class HCN {
    double dai,rong;
    public void GetInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai vao :");
        dai = sc.nextDouble();
        System.out.println("Nhap chieu rong vao : ");
        rong = sc.nextDouble();
    }
    public double GetArea(){
        return dai * rong;
    }
    public double GetPermeter(){
        return (dai + rong) * 2;
    }
    public void display(){
        System.out.println("Dien tich Hinh chu nhat la : "+GetArea());
        System.out.println("Chu vi Hinh chu nhat la : "+ GetPermeter());
    }
}

public class RectangleOOP {
    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.GetInfor();
        hcn.display();
    }
}
