public class math {
    public static double PI = 3.14;
    public int x,y;

    public static int abs(int x){
        if(x > 0 ){
            return x;
        }
        return -x;
    }

    public static int add(int x, int y){
        return y + x;
    }

    public static int sub(int x, int y){
        return x - y;
    }

    public static int min(int x,int y){
        if(x > y){
            return y;
        }
        return x;
    }

    public static int max(int x,int y){
        if(x < y){
            return y;
        }
        return x;
    }

    public static int pow(int x , int y){
        int pw = 1;
        for(int i = 1;i < y; i++){
            pw *= x;
        }
        return pw;
    }

    public static void main(String[] args) {
        System.out.println(math.PI);
        System.out.println(math.add(2, 2));
        System.out.println(math.sub(2, 2));
        System.out.println(math.max(2, 3));
        System.out.println(math.min(2, 3));
        System.out.println(math.pow(2, 2));
        System.out.println(math.abs(-12));
    }
}
