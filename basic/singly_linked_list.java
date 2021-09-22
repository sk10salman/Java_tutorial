class LinkedList{
   //Node head;
    static class Node{
        
            int data;
            Node next;
            Node(int d)
            {
                this.data = d;
                next = null;
            } // Constructor
        
    }
    public static void print(Node head)
    {
        Node p=head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }
    public static void main(String[] args)
    {
       //LinkedList list = new LinkedList();
       Node head = new Node(1);
       Node second=new Node(2);
       head.next = second;
       Node third = new Node(3);
       second.next = third;
       print(head);


    }
}
