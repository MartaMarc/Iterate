package komenda_iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author M
 */
public class Komenda_iterator {

    
    public static void main(String[] args) {
      LinkedList <String> names = new LinkedList<>();
    names.add("Ann");
    names.add("Hannah");
    names.add("Elle");
    names.add("Sophie");
    
    Iterator listIterate = names.iterator();
    
    while(listIterate.hasNext()){
        System.out.println(listIterate.next());
        
    } 
    }
    
}
