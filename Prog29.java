// find the max2 lagest no.
class Prog29{
	static public int show(int x[],int n){
		int max1=x[0];
		int max2=x[0];
for(int a:x){
	if(a>max1){
		max2=max1;
		max1=a;
	}
	else if(max2>a && max1!=max2){
		max2=a;
	}
}
return max2;
			
	}
public static void main(String ar[]){
int x[]={-10,-3,-40,45,45};
int n=5;


System.out.println(show(x,n));


}
}