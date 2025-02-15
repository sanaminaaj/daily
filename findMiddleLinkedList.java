public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node hare=head;
        Node rabbit=head;
        while(rabbit!=null&& hare.next!=null & rabbit.next!=null){
            rabbit=rabbit.next.next;
            hare=hare.next;
        }
        return hare;
    
    }
}
