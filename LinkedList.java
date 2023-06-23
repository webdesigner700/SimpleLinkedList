/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinay
 */
public class LinkedList {
    
    private Node head;
	
    public LinkedList() {
	head = null;
    }
	
    public void add(String data) {
            
	Node tempobject = new Node(data); 

	if(head == null) {
            head = tempobject;
	}	
	else {
            Node current = head;

            while (current.getNext() != null) {
				current = current.getNext();	
            }
            current.setNext(tempobject);
	}
		
    }
	
    public void add(int position, String data) {

	Node tempobject = new Node(data);
	boolean elementinserted = false;

		
	if(position == 0 && head == null) {
            head = tempobject;
	}

	else if (position ==0) { 
            tempobject.setNext(head); 
            head = tempobject;
	}
	else if (position > 0 && position < size() + 1){ 
            Node current = head; 
            int currentposition = 0;

            while(current.getNext() != null) { 

                Node prev = current;
		current = current.getNext(); 
		currentposition = currentposition + 1; 

		if (position == currentposition) {
                    tempobject.setNext(current);
                    prev.setNext(tempobject);
                    elementinserted = true;
                    break;
		}	
            }			
	}
    }
	
    public String get(int position) {

        Node current = head; 
	int currentposition = 0; 
	String data = null;

	if(position == 0) {

            if(head != null) {
		data = head.getData();
            }
	}
        else {

            while(current.getNext() != null) {
				
                current = current.getNext();
                currentposition = currentposition + 1;

                if(position == currentposition) {
                data = current.getData();
                break;
                }
            }
        }
        
        return data;
    }
	
    public String remove(int position) {

        String data = null;
	boolean elementremoved = false;

	if(position == 0) {

            if(head != null) {

		if(head.getNext() == null) {
                    data = head.getData();
                    head = null;
		}
		else {	

                    Node temp = head;	

                    data = head.getData();
                    head = head.getNext();
                    temp = null;
                }
            }
        }
	else {
			
            Node current = head;
            int currentposition = 0;
            Node prev = head;

            while(current.getNext() != null) { 
		prev = current; 
		current = current.getNext(); 
		currentposition = currentposition + 1; 

		if(position == currentposition) { 
                    data = current.getData(); 
                    prev.setNext(current.getNext()); 
                    current = null; 
                    elementremoved = true;
                    break;
		}
            }

            if(elementremoved == false && position == currentposition) {
		data = current.getData();
		prev.setNext(null);
		current = null;
            }
	}

	return data;

    }
	
    public String set(int position, String data) {
		
    // Change the data in the node at the specified position to the specified data, return what its data was.
    // If the specified position is out of bounds, return null.

        Node current = head;
        int currentposition = 0;
        String positiondata = null; 
        Node prev = head;
        boolean elementset = false;

        Node newdatanode = new Node(data);

        if(head != null && head.getNext() == null) {
            positiondata = head.getData();
            Node temp = head;
            head = newdatanode;
            temp = null;
        }
        else {

            while(current.getNext() != null) {
				
                prev = current;
                current = current.getNext();
                currentposition = currentposition + 1;

                if(position == currentposition) {
                
                    positiondata = current.getData();
                    newdatanode.setNext(current.getNext());
                    // Previous node of current should be set to newdatanode and after that make current null
                    prev.setNext(newdatanode);
                    current = null;
                    elementset = true;
                    break;
                }
            }
        }

        if(elementset = false && position == currentposition) {
            data = current.getData();
            prev.setNext(newdatanode);
            current = null;
        }

        return positiondata;
    }
	
    public int size() {

        Node current = head;
	int listsize = 0;

	while(current != null) {
            current = current.getNext();
            listsize = listsize + 1;
	}
	return listsize;
    }
	
    public boolean isEmpty() {

	boolean decider = false;

	if(head == null) {
            decider = true;
	}
	return decider;
    }
}
