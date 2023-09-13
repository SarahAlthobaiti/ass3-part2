//Student Name: Sarah Mohamed Althobiti , Student ID: 444004881
public class Node<E>{

  private E data;
  private Node next;

  public Node(){
     data = null;
     next = null;
  }
  public Node(E data){
    this.data = data;
    this.next = null;
     
  }
  public Node(E data, Node next){
    this.data = data;
    this.next = next;
  }

  public void setData(E data){
    this.data = data;
  }
  public void setNext(Node next){
    this.next = next;
  }
  public E getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

}