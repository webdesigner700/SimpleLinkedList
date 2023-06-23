/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author vinay
 */
public class SimplelinkedList {

    public static void main(String[] args) {
        
        LinkedList list1 = new LinkedList();
        
        list1.add("firstElement");
        
        LinkedList list2 = new LinkedList();
         
        list2.add("firstElement");
        
        LinkedList list3 = new LinkedList();
        
        list3.add("randomElement");
        
        boolean list12 = LinkedListUtils.equals(list1, list2);
        
        boolean list23 = LinkedListUtils.equals(list1, list3);
        
        System.out.println("List 1 and List 2 are equal = " + list12);
        System.out.println("List 2 and List 3 are equal = " + list23);
    }
}
