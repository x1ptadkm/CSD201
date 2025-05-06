public class Node{
    Person info;
    Node next;
    
    public Node(Person x, Node p){
        info=x;
        next=p;
    }    
    
    public Node(Person x){
        this(x,null);
    }
 }


/*
public class Node{
    private Person info;
    private Node next;
    
    public Node(){
        super();
    }
    
    public Node(Person info, Node next){
        super();
        this.info=info;
        this.next=next;
    }
    
    public Node(Person info){
        super();
        this.info=info;
        this.next=next;
    }
}
*/
