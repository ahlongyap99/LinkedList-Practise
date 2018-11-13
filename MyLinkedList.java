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
public class MyLinkedList {
    
    private Node first, last;
    private int size;
    
    public MyLinkedList(){
    
    }
    
    public Object getFirst(){
        if(size == 0)
            return null;
        else 
            return first.data;
    }
    
    public Object getLast(){
        if(size == 0)
            return null;
        else
            return last.data;
    }
    
    public void addFirst(Object o){
        Node newNode = new Node(o);
        newNode.link = first;
        first = newNode;
        size++;
        
        if(last == null)
            last = first;
    }
    
    public void addLast(Object o){
        Node newNode = new Node(o);
        if(last == null){
            first = newNode;
            last = newNode;
    }else{
        last.link = newNode;
        last = newNode;
        }
        size++;
    }
    
    public void add(int index, Object o){
        if(index == 0) addFirst(o);
        else if(index >= size) addLast(o);
        else{
            Node temp = first;
            for(int i =1; i<index; i++)
                temp = temp.link;
        
            Node newNode = new Node(o);
            newNode.link = temp.link;
            temp.link = newNode;
            size++;
        }
    }
    
    public Object removeFirst(){
        if(size == 0) return null;
        else{
            Node temp = first;
            first = temp.link;
            size--;
            
            return temp.data;
        }
    }
    
    public Object removeLast(){
        if(size > 0){
            Node temp = first;
            Node temp2 = last;
            for(int i = 1; i<size-1; i++)
                temp = temp.link;
            last = temp;
            last.link = null;
            size--;
            return temp2.data;
        }
        return null;
    }
    
    public Object remove(int index){
        if(index < 0 || index >= size)return null;
        else if (index == 0)return removeFirst();
        else if (index == size-1)return removeLast();
        else{
            Node temp1 = first;
            for(int i = 1; i<index; i++)
                temp1 = temp1.link;
            
            Node temp2 = temp1.link;
            temp1.link = temp2.link;
            size--;
            return temp2.data;
        }
            
    }
    
    
    public String toString(){
        StringBuffer result = new StringBuffer("[");
        
        if(size > 0){
            Node temp = first;
            for(int i=0; i<size; i++){
                result.append(temp.data);
                temp = temp.link;
                
                if(temp != null)
                    result.append(", ");
                else
                    result.append("] ");
            }
        }else{
                    result.append("]");
        }
        return result.toString();
    }
    
    private static class Node{
        Object data;
        Node link;
        
        public Node(Object o){
            data = o;
            link = null;
        }
}
    
}
