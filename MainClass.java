import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  a;
double  b;
boolean  c;
String  t;
char  d;
int  e;
int[] vec;
a= _key.nextDouble();
b= _key.nextDouble();
c= _key.nextBoolean();
d= _key.next().charAt(0);
e= _key.nextInt();
vec = new int[]{1,2,3,4};
t = "teste";
System.out.println(t);
System.out.println(t.length());
System.out.println(t);
System.out.println(vec.length);
do {
b = b+1;System.out.println(b);} while (b<a);

while (a<b) {
a = a+1;System.out.println(a);}

if (a==b) {
System.out.println(t);}else {
System.out.println(b);}

System.out.println(c);
System.out.println(d);
System.out.println(e);
  }}