public class CircularSinglyLL {
    //kelas Node
    static class Node{
        int data;
        Node next;
    };
    
    static Node addToEmpty(Node last, int data)
    {
        //fungsi hanya untuk list yang kosong
        if (last != null)
            return last;
        
        //membuat Node secara dinamis
        Node temp = new Node();
        
        temp.data = data;
        last = temp;
        
        //buat link
        last.next = last;
        
        return last;
    }
    
    static Node addBegin(Node last, int data){
        if (last == null)
            return addToEmpty(last, data);
        Node temp = new Node();
        
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        
        return last;
    }
    
    static Node addEnd(Node last, int data){
        if (last == null)
            return addToEmpty(last, data);
        Node temp = new Node();
        
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        last = temp;
        
        return last;
    }
    
    static Node addAfter(Node last, int data, int item){
        if (last == null)
            return null;
        
        Node temp, p;
        p = last.next;
        
        do{
            if (p.data == item){
                temp = new Node();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;
                
                if (p == last)
                    last = temp;
                return last;
            }
            p = p.next;
        }
        while (p != last.next);
        
        System.out.println(item + "not present in the list (tidak ada didalam list)");
        return last;
    }
    
    static void traverse(Node last){
        Node p;
        
        //jika listnya kosong, return (kembali)
        if (last == null){
            System.out.println("List is Empty (List Kosong) ");
            return;
        }
        
        //menmepatkan ke node pertama ke dalam list
        p = last.next;
        
        //traverse list
        do{
            System.out.print(p.data + " ");
            p = p.next;
        }
        while (p != last.next);
    }
    
    //membuat main class
    public static void main (String[] args){
        Node last = null;
        
        last = addToEmpty(last, 6);
        last = addBegin(last, 9);
        last = addBegin(last , 90);
        last = addEnd(last, 80);
        last = addEnd(last, 70);
        last = addAfter(last, 10, 9);
        
        traverse(last);
    }
}
