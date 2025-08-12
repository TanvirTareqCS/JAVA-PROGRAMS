class Car{
    String make;
    String model;
    int year;

    Car(){
        make="Maked";
        model="Toyota";
        year=2023;
    }
    Car(String m,String mo,int y){
        make=m;
        model=mo;
        year=y;
    }
    void print(){
        System.out.println("The Car is: "+make);
        System.out.println("The model of the car is :"+model);
        System.out.println("It was made is "+year);
    }
}
public class javacar {
    public static void main(String[] args) {
        Car ob1=new Car();
        Car ob2=new Car("Not maked","Tesla",2026);

        ob1.print();
        ob2.print();
    }
}