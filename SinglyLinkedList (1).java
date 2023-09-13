//Student Name: Sarah Mohamed Althobiti , Student ID: 444004881
public class SinglyLinkedList<E>{
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;

    }
    public int getSize(){
        return size;
    }
    public Node getFirst(){
        return head;
    }
    public Node getLast(){
        return tail;
    }
     boolean isEmpty(){
        return size == 0;
    }
    public void display(){
        Node c = new Node();
        c = head;
        while (c != null){
            System.out.print(c.getData() + " ");
            c = c.getNext();
        }
        System.out.println();
    }
    public boolean isThere(E key){
        Node c = head;
        while(c != null){
            if(c.getData() == key){
                return true;
            }
            c = c.getNext();
        }
        return false;

    }

    public void addFirst(E e){
        Node newest = new Node(e);
        newest.setNext(head);
        head = newest;
        if(isEmpty()){
            tail = newest;
        }
        size ++;

    }
    public void addLast(E e){
        if(isEmpty()){
            addFirst(e);
        }else{
            Node newest = new Node(e);
            tail.setNext(newest);
            tail = newest;
            size++;
        }

    }
    public void addMiddle(E e , E key){
        if(isEmpty()){
            addFirst(e);
        }else{
            if(isThere(key)){
            Node newest = new Node(e);
            Node c = head;
            while(c.getData() != key){
                c = c.getNext();
            }
            newest.setNext(c.getNext());
            c.setNext(newest);
            size++;
           } else{
            System.out.println("the key is not found");
           }
            
        }

    }
    public void removeFirst(){
        if(isEmpty()){
            return;
        }
        head = head.getNext();
        size--;
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("the list is empty");
        }
        else if(head.getNext() == null){
            head = null;
        }else{
            Node c = head;
            while(c.getNext().getNext() != null){
                c = c.getNext();
            }
            c.setNext(null);
            tail = c;
        }
        size--;


    }
    public void removeMiddle(E key){
      if(isEmpty()){
        System.out.println("the list is empty");

      } else if(head.getData()== key){
        removeFirst();
      }else{
        if(isThere(key)){
        Node c = head;
        while(c.getNext().getData() != key ){
            c = c.getNext();
        }
         Node temp = c.getNext();
         c.setNext(temp.getNext());
         size--;
        }else{
            System.out.println("not found");
        }
      }

    }

}