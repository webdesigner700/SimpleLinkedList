/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinay
 */
public class LinkedListUtils {
    
    public static boolean contains(LinkedList list, String data) {

	boolean decider = false;
	int listsize = list.size(); // We are obtaining the size of the list here.
	String datachecker = null;
		
	for(int i = 0; i< listsize; i++) {
            datachecker = list.get(i);
            if(data.equals(datachecker)) {
            decider = true;
            }
        }
        return decider;
    }
	
    public static int indexOf(LinkedList list, String data) {

	int indexchecker = -1; 
	int listsize = list.size();
	String datachecker = null;

	for(int i = 0; i< listsize; i++) {
            datachecker = list.get(i);
            if(data.equals(datachecker)) {
		indexchecker = i;
		break;
            }
	}

	return indexchecker;
    }
	
    public static int lastIndexOf(LinkedList list, String data) {

        int indexchecker = -1;
        int listsize = list.size();
	String datachecker = null;

	for(int i = 0; i < listsize; i++) {
            datachecker = list.get(i);
            if(data.equals(datachecker)) {
		indexchecker = i;
            }
	}

	return indexchecker;
    }
	
    public static int count(LinkedList list, String data) {

	int count = 0;
	int listsize = list.size();
	String datachecker = null;

	for(int i = 0; i < listsize; i++) {
            datachecker = list.get(i);
            if(data.equals(datachecker)) {
            count = count + 1;
            }
        }

	return count;
    }
	
    public static void remove(LinkedList list, String data) {

	int listsize = list.size();
	String datachecker = null;

	for(int i = 0; i < listsize; i++) {
            datachecker = list.get(i);
            if(data.equals(datachecker)) {
                list.remove(i);
            }
        }
    }
	
    public static String[] toArray(LinkedList list) {

	int listsize = list.size();
	String[] samelist = new String[listsize];
		
	for(int i = 0; i <listsize; i++) {
            samelist[i] = list.get(i);
	}

	return samelist;
    }
	
    public static String toString(LinkedList list) {
        
	int listsize = list.size();
	String listString = "[";
	int temp = 0;
		
	for(int i = 0; i< listsize; i++) {
            listString = listString + list.get(i);
            if(list.get(i + 1) != null) {
            listString = listString + ", ";
                if(list.get(i + 1) == null) {
                    listString = listString + list.get(i);
                    break;
                }
            }
        }

        listString = listString + "]";

	return listString;
    }
	
    public static boolean equals(LinkedList list1, LinkedList list2) {

	boolean decider = false;
	int listsize1 = list1.size();
	int listsize2 = list2.size();
	String datachecker1 = null;
	String datachecker2 = null;

	if(list1.isEmpty() && list2.isEmpty()) {
            decider = true;
	}

	if(listsize1 == listsize2) {

            for(int i = 0; i < listsize1; i++) {
		datachecker1 = list1.get(i);
		datachecker2 = list2.get(i);
		if(datachecker1.equals(datachecker2)) {
                    decider = true;
		}
		else {
                    decider = false;
		}
            }
	}
	return decider;
    }
	
    public static LinkedList reverse(LinkedList list) {

        LinkedList reverselist = new LinkedList();

        int listsize = list.size();
        String data = null;

        for(int i = listsize - 1; i >= 0; i--) {
            data = list.get(i);
            reverselist.add(data);
        }
        return reverselist;
    }
	
    public static LinkedList removeDuplicates(LinkedList list) {

        LinkedList copylist = new LinkedList();

	int listsize = list.size();
	String data1 = null;
	int copylistsize = 0;
	boolean datachecker;
	String data2 = null;

	for(int i = 0; i< listsize; i++) {
            
            data1 = list.get(i);
            copylistsize = copylist.size();
            datachecker = false;
            
            for(int j = 0; j < copylistsize; j++) {
                data2 = copylist.get(j); 
                
                if(data1 == data2) {
                    datachecker = true;
                    break;
                }
            }
            
            if(datachecker == false) {
                copylist.add(data1);
            }
	}
	return copylist;
    }
	
    public static LinkedList sort(LinkedList list) {

	LinkedList sortedlist = new LinkedList();

	int listsize1 = list.size();
	String data1 = null;
	String data2 = null;
	int listsize2 = 0;
	boolean datachecker;

	for(int i = 0; i < listsize1; i++) {

            data1 = list.get(i);
            listsize2 = sortedlist.size();
            int j = 0;

            if(listsize2 == 0) {
		sortedlist.add(data1);
            }
            else {
		datachecker = false;
		for(j = 0; j < listsize2; j++) {
                    data2 = sortedlist.get(j);
                    if(lessThan(data1, data2)) {
			sortedlist.add(j, data1);
			datachecker = true;
			break;
                    }
		}

		if(datachecker == false) {
                    sortedlist.add(j, data1);
		}
            }
	}
	return sortedlist;
    }

    private static boolean lessThan(String a, String b)  {
        return a.compareTo(b) < 0;
    }
}
