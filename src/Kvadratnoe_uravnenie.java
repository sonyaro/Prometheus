public class Kvadratnoe_uravnenie {

    public static void main(String[] args) {
        double a = 101;
        double b = 101;
        double c = 101;

        double diskriminant = b * b - 4 * a * c;
        double x = 0.0;
        if (a == 0 && b == 0){
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else if (a == 0){
            if (c != 0){
                x = -c / b;
            }
            System.out.println("x1=" + x);
            System.out.println("x2=" + x);
        }
        else if (diskriminant < 0){
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else {
            double x1 = ( -b + Math.sqrt(diskriminant)) / ( 2 * a );
            double x2 = ( -b - Math.sqrt(diskriminant)) / ( 2 * a );
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}
