
package homework;

import java.util.Scanner;


public class Homework {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a =scanner.nextInt();
        System.out.print("Nhap so nguyen b (b!=0) : ");
        int b = scanner.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = (b!=0) ? (a/b) : 0;
        int phandu = (b!=0) ? (a%b) : 0;
        System.out.println("Tong : "+tong);
        System.out.println("Hieu : "+hieu);
        System.out.println("Tich : "+tich);
        if (b==0)
        {
            System.out.println("Khong thuc hien duoc phep chia ");
        }
        else
        {
            System.out.println("Thuong : "+thuong);
            System.out.println("Phan du : "+phandu);
        }
    }
    
}
