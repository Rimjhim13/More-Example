//method Hideing op=class A
class A{
static void show(){
	System.out.print("class A");
}	
}
class B extends A{
static void show(){
	System.out.print("class B");
}	
}
class Prog9{
public static void main(String ar[]){
	A a=new B();
	a.show();

}
}