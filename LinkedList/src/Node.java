public class Node {
    Person info; // info (data item
    Node nextNode; // next
    
    public Node(Person info, Node next){
        super();
        this.info=info;
        this.next=next;
    }
    
    public Node(){
        super();
    }
    
    public Node(Person info){
        super();
        this.info=info;
        this.next=null;
    }
    
}
