package MergeTwoSortedLinkedLists;


class ListNode{
    int value;
    ListNode next;
    ListNode(){};
    ListNode(int value){this.value=value;}
    ListNode(int value, ListNode next){
        this.value=value;
        this.next=next;
    }
}



public class MergeTwoSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode headNode = new ListNode(0);
        ListNode returnNode = headNode;

        while (list1 !=null && list2 !=null){

            if(list1.value <= list2.value){
                returnNode.next = list1;
                list1 = list1.next;
            }else{
                returnNode.next = list2;
                list2 = list2.next;
            }

            returnNode = returnNode.next;
        }

        if (list1 == null) {
            returnNode.next =list2;
        } else {
            returnNode.next =list1;
        }

        return headNode.next;
    }


    public static void main( String[] args) {
        MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next= new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next= new ListNode(4);

        ListNode res = mergeTwoSortedLinkedLists.mergeTwoLists(list1,list2);

        while (res!=null){
            System.out.print(res.value+ " ");
            res=res.next;
        }

//        System.out.println("the sorted linked list is: "+ res);

    }
}
