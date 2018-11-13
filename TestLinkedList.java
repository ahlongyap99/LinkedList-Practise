/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author ASUS
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        list.addFirst("America");
        System.out.println("(01) "+list);
        
        list.addLast("Canada");
        System.out.println("(02) "+list);
        
        list.addFirst("Russia");
        System.out.println("(03) "+list);
        
        list.addLast("France");
        System.out.println("(04) "+list);
        
        list.addFirst("Germany");
        System.out.println("(05) "+list);
        
        list.addLast("Norway");
        System.out.println("(06) "+list);
        
        list.addFirst("Netherlands");
        System.out.println("(07) "+list);
        
        list.remove(4);
        System.out.println("(08) "+list);
        
        list.removeFirst();
        System.out.println("(09) "+list);
        
        list.removeLast();
        System.out.println("(10) "+list);
    
    }
}
