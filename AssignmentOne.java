package mypractice;

public class AssignmentOne { 
	public int additionofthreenumber(int a, int b, int c) {
		int x=a+b+c;
		return x;}
	public int subtractionofthreenumber(int a, int b) {
		int y=a-b;
		return y;}
	public double multiplytwonumber(double a, double b) {
		double z=a*b;
		return z;}
	public float dividetwonumber(float a, float b) {
		float k=a/b;
		return k;}
public static void main(String[] args) {
	AssignmentOne obj= new AssignmentOne();
	int add= obj.additionofthreenumber (1,2,3);{
	System.out.println(add);}
	int sub= obj.subtractionofthreenumber (5,3);{
		System.out.println(sub);}
	//AssignmentOne help= new AssignmentOne();
	double mul= obj.multiplytwonumber(8.8,2.2);{
		System.out.println(mul);}
	float div= obj.dividetwonumber(10,2);{
		System.out.println(div);
	}
	}
	
	
}


