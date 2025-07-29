import java.util.Scanner;
class book{
    Scanner scanner = new Scanner(System.in);
    String tittle;
    String author;
    int yearPublished;
    book(){
        System.out.println("Enter the Name of the Book:");
        String ti=scanner.nextLine();
        System.out.println("Enter the Name of the Author:");
        String au=scanner.nextLine();
        System.out.println("Enter the Publishing year of the book:");
        int pyl=scanner.nextInt();
         tittle =ti;
         author =au;
         yearPublished =pyl;
    }
    book(int a,int b){
        tittle="c++";
        author="Tanvir";
        yearPublished=2026;
        int sum=a+b;
        System.out.println("\nThe sum of the two number is :"+sum);
    }
    book(int a,int b,int c){
        tittle="Math";
        author="Khairul Basar";
        yearPublished=1980;
        int mul=a*b*c;
        System.out.println("The Product of three numbers are: "+mul+"\n");
    }
    void displayInfo(){
        System.out.println("The Name of the book is --> "+tittle);
        System.out.println("The Name of the writer is --> "+author);
        System.out.println("The book "+tittle+" was Publish in --> "+yearPublished);
    }
}
    public class Constractore {
    public static void main(String[] args) {
              book ob1=new book();
              book ob2=new book(10,20);
              book ob3=new book(3,5,8);


        System.out.println("\nObject 1 Info -->");
              ob1.displayInfo();
        System.out.println("\nObject 2 Info -->");
              ob2.displayInfo();
        System.out.println("\nObject 3 Info -->");
              ob3.displayInfo();
        }
    }
