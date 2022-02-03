class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

class SinglyLinkedList1 {
    Node head;

    public void insertatbeggning(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            head=newnode;
            head.next=temp;
        }
    }

    public void insertatLast(Node newnode) {
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void insertatposition(int pos,Node newnode)
    {
        Node temp=head;
        for(int i=0;i<pos-2;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }

    public void deletefrombegining()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            head=head.next;
        }


    }

    public void deletefromend()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            if(head.next==null)
            {
                head=null;
            }
            else
            {
                Node temp=head;
                while(temp.next.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=null;
            }
        }

    }

    public void deleteatposition(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos-2;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("Linked List is Empty");
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }


        }
    }
}
public class Test {
    public static void main(String[] args) {
        SinglyLinkedList1 obj1=new SinglyLinkedList1();

        System.out.println(" Insert element at the end of Linked List");
        obj1.insertatLast(new Node(10));
        obj1.insertatLast(new Node(20));
        obj1.insertatLast(new Node(40));
        obj1.display();
        System.out.println("-------------------");

        System.out.println(" Insert element at the begnning of Linked List");
        obj1.insertatbeggning(new Node(30));
        obj1.display();
        System.out.println("-------------------");

        System.out.println(" Insert element at the certain position  of Linked List");
        obj1.insertatposition(3,new Node(50));
        obj1.display();
        System.out.println("-------------------");

        System.out.println(" Delete one  element at the begning of Linked List");
        obj1.deletefrombegining();
        obj1.display();
        System.out.println("-------------------");

        System.out.println(" Delete one  element at the end of Linked List");
        obj1.deletefromend();
        obj1.display();
        System.out.println("-------------------");

        System.out.println(" Delete one  element at the certain position of Linked List");
        obj1.deleteatposition(2);
        obj1.display();
        System.out.println("-------------------");

    }
}
