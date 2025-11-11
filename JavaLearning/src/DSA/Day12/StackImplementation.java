package DSA.Day12;
public class StackImplementation {
    private ListNode top;
    int length;
    public StackImplementation(){
        this.top=null;
        this.length=0;
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            top=newNode;
            return;
        }
        top.next=newNode;
        top=newNode;
    }
}
