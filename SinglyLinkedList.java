class Node {
    int data;
    Node next;
     
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

// int node; douBle node;

// jAVA DON'T HAVE ANY DATA THAT WILL STORE ANY DATA AND REFERENCE
// INT STORE => NUMBER AND REFL;
// DOUBLR-

// [data | null]

// 0 node hdead => null 

    // data , k<=0; nodes will be there or not there;

    // data, k =1, ndoe will be there or not there 
    // k=1 , nodes will be there;

    // while(true){} if num>0 


public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList(){
        this.head= null;
    }
        
    public void insertionAtLast(int data){

        Node newNode = new Node(data);

        if(head ==null){ // one node 
            head= newNode;
        }else{
            Node curNode = head;
            while(curNode.next !=null){
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    // n1, n2, n3.    n4

    // k==1, 0nodes, 
    // k==1, 1node
    // k=1 more node;
    public void insertionAtKthPostion( int data ,int k){
        Node newnode = new Node(data);
        if(k <=0){
            return ;
        }else if(k ==1  && head == null){
               Node newNode = new Node(data);
               head =newNode;
        } else if(k==1 && head !=null){
             Node newNode = new Node(data);
             newNode.next = head;
             head = newNode;
        }
        else{
            Node newNode = new Node(data);
            Node currNode = head;
            k = k-1;
            while(k>0 ){
                currNode= currNode.next;
                k--;
            }
            newNode.next = currNode.next;
            currNode.next= newNode;
        }
    }
    // 0 nnode
    // 1 node 
    // more than one node  // 2 2  

    public void deletioinAtLast(){

            if(head ==null){
                return;
            }else if(head.next ==null){
                head =null;
                return;
            }else{
                Node current = head;
                Node current2 = current.next;

                while(current2.next !=null){
                    current= current.next;
                    current2 = current2.next;
                }

                // while(current.next.next !=null){ // current2.next === currrent.next.next
                //     current = current.next;
                // }
                current.next= null;
            }

    }

    // k<=0 
    // k=1, node 1  head =null   k =1, node =1
    //k=1 node more 1, k=1. n1, n2, n3
    //  
    public void deletionAtKthPosition(int k){
        if(k<=0){
            return;
        }
        if(k ==1){
            head= head.next;
            return;
        }
        else{
            Node currentNode = head;
            Node prev = null;
            k= k-1;
            while(k>0){
                 prev = currentNode;
                currentNode= currentNode.next;
                k--;
            }
            prev.next = currentNode.next;
        }
    }

    // n1 n2 n3 n4

         public void display(){

            if(head == null){
                System.out.println("Linked List is empty");
                return;
            }
            Node curNode = head;
            while(curNode != null){
                System.out.println(curNode.data + "  data ");
                curNode = curNode.next;
            }
            
        }

     public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insertionAtLast(1);
         linkedList.insertionAtLast(2);
          linkedList.insertionAtLast(3);
           linkedList.insertionAtLast(4);
            linkedList.deletioinAtLast();
            linkedList.display();
                 System.out.println("----------------");
            linkedList.insertionAtKthPostion(5, 2);
             linkedList.insertionAtKthPostion(6, 1);
             linkedList.display();
                  System.out.println("--------------");
             linkedList.deletionAtKthPosition(3);
              linkedList.display();
                System.out.println("--------------");
           linkedList.deletionAtKthPosition(1);
              linkedList.display();
    }
}
