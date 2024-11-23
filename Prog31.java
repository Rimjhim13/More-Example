// multiple inheritance by using compostion 
class A{
	void show(){
		System.out.println("Class A method");
	}

}

class B{
	void show(){
		
		System.out.println("Class B method");
	}
	
}
class C{
	void show(){
		A a=new A();
		a.show();
		B b=new B();
		b.show();
		System.out.println("Class C method");
	}
}
class Prog31{
	public static void main(String ar[]){
		C c=new C();
		c.show();
		
	}
	
}