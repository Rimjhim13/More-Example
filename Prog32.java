// composition example
class Car{
String part;
void Car(String name){
part=name;
System .out.println("car has a "+part);
}
}
class Engine{
String show(){
return "engine";
}
}
class Prog32{
	public static void main(String ar[]){
		Car c=new Car();
		Engine e=new Engine();
		c.Car(e.show());
		
	}
	
}