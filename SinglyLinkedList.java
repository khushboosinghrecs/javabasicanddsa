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

    public void insertionAtKthPostion( int data ,int k){
        Node newnode = new Node(data);
        if(k <=0){
            return ;
        }else if(k ==1  && head == null){
            insertionAtLast(data);
        }else{
            Node newNode = new Node(data);
            Node currNode = head;
            k = k-1;
            while(k>0){
                currNode= currNode.next;
                k--;
            }
            newNode.next = currNode.next;
            currNode.next= newNode;
        }
    }

    public void deletioinAtLast(){

    }

    public void deletionAtKthPosition(){
        
    }
     public static void main(String[] args) {
        
    }
    
}
