package java_Pra;

import java.util.ArrayList;    
import java.util.List;    
import java.util.stream.Stream;     
class P{    
    int id;    
    String n;    
    float pri;    
    public P(int id, String n, float pri) {     
        this.id = id;    
        this.n = n;    
        this.pri = pri;    
    }    
}    
public class arrowop{    
    public static void main(String[] args) {    
        List<P> l = new ArrayList<P>();    
        l.add(new P(1," JavaTpoint ",17000));    
        l.add(new P(3," Tutorial and example ",100500));    
        l.add(new P(2," Website ",25000));    
            
        // using the arrow to filter data    
        Stream<P> filtered_data = l.stream().filter(a -> a.pri > 17000);  
        filtered_data.forEach(    
                p -> System.out.println(p.n+": "+p.pri)    
        );    
    }  
}  

