package javaoop2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1;
		double x2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap A: ");
		double a=sc.nextDouble();
		System.out.print("Nhap B: ");
		double b=sc.nextDouble();
		System.out.print("Nhap C");
		double c=sc.nextDouble();
		QuadraticEquation qua1=new QuadraticEquation(a,b,c);
		if(qua1.getA()==0) {
			if(qua1.getB()==0 && qua1.getC()== 0) {
				System.out.print("Phuog trinh co vo so nghiem");
			}
			if(qua1.getB()==0 &&qua1.getC() != 0) {
				System.out.print("Phuong trinh vo nghiem");
			}
		}else {
			if(qua1.delta()==0) {
				x1=qua1.getX3();
				x2=qua1.getX3();
				System.out.print("x1=x2="+x1);
			}
			else if(qua1.delta()<0) {
				System.out.print("vo nghiem");
			}else {
				x1=qua1.getX1();
				x2=qua1.getX2();
				System.out.print("x1="+x1+"x2="+x2);
			}
		}
	}

}
