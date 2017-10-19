package HW72;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SoftHome72 {
    public static void main(String[] args) {
        Map personMap=new TreeMap<String,String>();
        personMap.put("Willis","Bruce");
        personMap.put("Schwarzenegger","Arnold");
        personMap.put("Chan","Jackie");
        personMap.put("Stallone","Sylvester");
        personMap.put("Norris","Chuck");
        personMap.put("DeNiro","Robert");
        personMap.put("Stetham","Jason");
        personMap.put("Chan","Robert");
        personMap.put("Franco","James");
        personMap.put("Lel","Orest");

        String name="Robert";
        String name2="Orest";
        int count = 0;
        for (Iterator i = personMap.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            if(name.equals(entry.getValue()))
            {
                count++;
            }
            if(name2.equals(entry.getValue()))
            {
                i.remove();
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Існує "+count+" людини з іменем Robert");
    }
}

