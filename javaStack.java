class stack {
    int[] starr = new int[10];
    int size=0;
    int top=-1;

    stack(){
        for(int i=0;i<starr.length;i++){
            starr[i]=0;
        }
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(size==starr.length){
            return true;
        }
        return false;
    }
    void push(int item){
        if(isFull()){
            System.out.println("Can not push Item the Stack is full!!");
        }
        else{
            top++;
            starr[top]=item;
            size++;
            System.out.println("Item pushed Successfully!!!!");
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("The stack is Empty can't pop any item");
        }
        else{
            System.out.println("Successfully pop out item "+starr[top]+"!!!!");
            starr[top]=0;
            top--;
            size--;
        }
    }

    void view(){
        System.out.println("The Stack is --> ");
        for(int i=0;i<starr.length;i++){
            System.out.println(starr[i]+" ");
        }
    }

}
public class javaStack {
    public static void main(String[] args){
        stack ob1=new stack();

        ob1.pop();
        ob1.push(12);
        ob1.push(24);
        ob1.push(1000);
        ob1.push(50);
        ob1.push(21);
        ob1.push(23);
        ob1.push(22);
        ob1.pop();
        ob1.push(222);
        ob1.push(42);
        ob1.push(32);
        ob1.push(90);
        ob1.push(43);
        ob1.push(21);
        ob1.pop();

        ob1.view();

    }
}


