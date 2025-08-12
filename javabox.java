

class box{
    int length;
    int width;
    int depth;

    box(int l,int w,int d){
        if ( l==10 && w==12 && d==8 ){
            System.out.println("The dimention is Correct");
            length=l;
            width=w;
            depth=d;
        }
        else{
            System.out.println("Error!!!!");
            int changel=l-10;
            int changew=w-12;
            int changed=d-8;
            if (changel<0){
               System.out.println("Increment the length by "+Math.abs(changel));
            }
            else{
                System.out.println("Decrement the length by "+Math.abs(changel));
            }
            if (changew<0){
                System.out.println("Increment the width by "+Math.abs(changew));
            }
            else{
                System.out.println("Decrement the width by "+Math.abs(changew));
            }
            if (changed<0){
                System.out.println("Increment the depth by "+Math.abs(changed));
            }
            else{
                System.out.println("Decrement the depth by "+Math.abs(changed));
            }
        }
    }
    void printinfo(){
        System.out.println("The length of the box is: "+length);
        System.out.println("The length of the box is: "+width);
        System.out.println("The length of the box is: "+depth);
    }
}
public class javabox {
    public static void main(String[] args){
        box ob1=new box(10,12,8);
        box ob2=new box(5,20,8);
    }
}

