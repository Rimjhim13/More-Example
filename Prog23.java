//default constructor is call
class A{
/*A()
{
	supper/this;
	{
		instance block;
	}
	
} internal working of default constructor*/
void show(){
	System.out.println("method calling");
}

}
class Prog23{
public static void main (String ar[]){
A a=new A();
a.show();
}
}