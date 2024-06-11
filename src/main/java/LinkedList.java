// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    
    public LinkedList(){
        head = null;
    }
    
    public void addFirst(String data){
        Node curr = new Node(data);
        if(head == null){
            head = curr;
            return;
        }
        curr.next = head ;
        head = curr;
        
    }
    
    public void addLast(String data){
        Node curr = new Node(data);
        if(head == null){
            head = curr;
        }
        Node currNode = head ;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = curr;
    }
    
    public void deleteStart(){
        if(head == null){
            System.out.println("Nothing to delete in the list");
            return;
        }
        Node curr = head;
        head = curr.next;
        
    }
    
    public void deleteEnd(){
        if(head == null){
            System.out.println("Nothing to delete in the list");
            return ;
        }
        if(head.next == null){
            head = null;
        }
        Node curr = head ;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            curr = curr.next;
        }
        curr.next = null;
    }
    
    public void printList(){
         Node currNode = head ;
        if(head == null){
            head = currNode;
            return ;
        }
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("-----END-----");
    }
    
    public static void main(String arg[]){
        LinkedList list = new LinkedList();
        list.addFirst("magic");
        list.addFirst("is");
        list.addFirst("Crypto");
        list.addLast("!!!!!");
        // list.deleteStart();
        list.deleteEnd();
        list.printList();
        
    }
}
