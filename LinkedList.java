
public class LinkedList {
   static int count = 0;
Node head;

    //creating node 
  class Node{
    String data;
    Node  next ;

    
   Node(String data){
   this.data = data ;
   this.next=null;
    }
  }


  // add first 
  public void addFirst(String data){
    Node newNode = new Node(data);

    if(head==null){
        System.out.println("Liked list is empty or no list present : ");
        head=newNode ;
        return;
    }

    newNode.next=head;
    head=newNode;
    count++;
}

// add last 

public  void lastadd(String data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode ;
        return;

    }
    Node currentNode = head;

    while(currentNode.next!=null){
        currentNode =currentNode.next;

    }

    currentNode.next= newNode;
    count ++;


}
//  add in the middle 

public void addmiddle(String data, int position){
    Node newNode= new Node(data);
    if(position==0){
        addFirst(data);
        return ;
    }
    Node currentNode = head ; 
    int i = 0  ; 
    while(i<position-1){
     currentNode=currentNode.next;
     i++  ;

    }
   // connect first  left node 
    newNode= currentNode.next;
    currentNode = newNode;
 
count++;


}
// remove from the middle of linked list 
public void deletemiddle(int position){
if(head==null){
    System.out.println("list is empty : ");

}

int i = 0;
Node currentNode = head;
while(i<position-1 && currentNode!=null){
    currentNode = currentNode.next;
    i++ ;
}

if(currentNode==null || currentNode.next==null ){
    return;
}

currentNode.next=currentNode.next.next;
count--;
}



//delet first 
public void delete(){
    if(head==null){
        System.out.println("list is empty : ");
        return;
    }

    head = head.next;
}

// delete last 
public void deletelast(){

    // case 1 list is empty 
    if(head==null){
        System.out.println("list is empty : ");
        return;
    }

    // case 2 list is only one node 
    if(head.next==null){
        head=null;
        return;
        
    }

    Node currentNode = head ;
   //case  3 last node  
  while(currentNode.next!=null){
    currentNode = currentNode.next;
  }
  currentNode.next=null;
  count --;
}

//display Node 
public void printlist(){
    if(head==null){
        System.out.println("list is empty : ");
    }

   Node currentNode = head;
    while(currentNode==null){
        System.out.println(currentNode.data+ " "+ "-->>");
        currentNode = currentNode.next;
    }

   
}
public static int counter(){
    return count;
}

   
public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst("G");
    ll.lastadd("A");
    ll.addmiddle("N", 1);
    ll.printlist(); // Expected: G -> N -> A -> null
    
    ll.delete();
    ll.printlist(); // Expected: N -> A -> null
    
    ll.deletelast();
    ll.printlist(); // Expected: N -> null
    
    ll.deletemiddle(0);
    ll.printlist(); // Expected: List is empty
}


}