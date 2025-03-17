
interface Printable {  
    void print();  
}  
class Document implements Printable {  
    public void print() {  
        System.out.println("Printing a document...");  
    }  
}  
public class Interface2 {  
    public static void main(String[] args) {  
        Printable doc = new Document();  
        doc.print();  
    }  
}
