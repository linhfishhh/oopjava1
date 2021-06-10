package javaoop2;

public class QuadraticEquation {
	private double a,b,c;
	public QuadraticEquation(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void setA(double a) {
		this.a=a;
	}
	public double getA() {
		return this.a;
	}
	public void setB(double b) {
		this.b=b;
	}
	public double getB() {
		return this.b;
	}
	public void setC(double c) {
		this.c=c;
	}
	public double getC() {
		return this.c;
	}
	public double delta() {
		return Math.pow(this.b, 2)-4*this.a * this.c;
	}
	public double getX1() {
		return (-this.b+Math.sqrt(delta()))/2*a;
	}
	public double getX2() {
		return (-this.b-Math.sqrt(delta()))/(2*a);
	}
	public double getX3() {
		return (-this.b/(2*a));
	}
}
