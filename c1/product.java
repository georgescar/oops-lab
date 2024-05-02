class product{
int pcode;
String pname;
double price;
product(int c,String n,double p){
pcode=c;
pname=n;
price=p;
}
void display(){
System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void lowest(double p1,double p2,double p3){
if(p1<p2&&p1<p3)
{
System.out.println("Product 1 has the lowest price");
}
else if(p2<p1&&p2<p3){
System.out.println("Product 2 has the lowest price");
}
else{
System.out.println("Product 3 has the lowest price");
}
}
public static void main(String[] args){
product obj1=new product(1,"soap",110.56);
product obj2=new product(2,"oil",50);
product obj3=new product(3,"cheap",35);
System.out.println("George Scaria"+"\n"+"23mca030"+"\n"+"13/02/2024");
System.out.println("\nProduct_Code\tProduct_Name\tProduct_Price");
obj1.display();
obj2.display();
obj3.display();
lowest(obj1.price,obj2.price,obj3.price);
}
}


