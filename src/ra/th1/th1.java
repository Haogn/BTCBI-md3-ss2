package ra.th1;

import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình tuyến tính ");
        System.out.println("Cho phương trình 'a * x + b = c' ");
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập số a ");
        double a = sc.nextDouble();
        System.out.println("Nhập số b ");
        double b = sc.nextDouble();
        System.out.println("Nhập số c ");
        double c = sc.nextDouble();
        if (a!=0) {
            double x = (c-b)/a ;
            System.out.println("Phuơng trình có 1 nghiệm duy nhất " + x);
        } else {
            if (b==c) {
                System.out.println("Phương trình có vô số nghiệm x ");
            } else {
                System.out.println("Phương trình vô nghiệm ");
            }
        }
    }
}
