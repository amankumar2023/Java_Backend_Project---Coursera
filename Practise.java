import java.util.*;

class Practise
{
    public static void main(String []args)
    {
        // ArrayList
        List<Integer> l1 = new ArrayList<Integer>();
 
        l1.add(0, 1);
        l1.add(1, 2);
 
        System.out.println(l1);

        // LinkedList
        List<Integer> ll = new LinkedList<Integer>();
 
        for (int i = 1; i <= n; i++)
            ll.add(i);
 
        System.out.println(ll);

        // Vector        
        List<Integer> v = new Vector<Integer>(n);
 
        for (int i = 1; i <= n; i++)
            v.add(i);
 
        System.out.println(v);

        // Stack
        Stack stack1 = new Stack();
 
        Stack<String> stack2 = new Stack<String>();
 
        stack1.push("4");
        stack1.push("All");
        stack1.push("to");
 
        stack2.push("G");
        stack2.push("f");
        stack2.push("s");
 
        System.out.println(stack1);
        System.out.println(stack2);

        // Queue
        Queue<String> pq = new PriorityQueue<>();
 
        pq.add("s");
        pq.add("r");
        pq.add("s");
 
        System.out.println(pq);

        // HashMap
        Map<String, Integer> hm 
            = new HashMap<String, Integer>(); 
            
        // LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>(); 
   
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 

        // TreeMap
        Map<String, Integer> map = new TreeMap<>(); 
   
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 

        // HashSet
        Set<String> hash_Set = new HashSet<String>(); 
   
        hash_Set.add("is"); 
        hash_Set.add("or"); 
        hash_Set.add("is"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
   
        System.out.println(hash_Set); 

        // TreeSet
        Set<String> ts = new TreeSet<String>(); 
   
        ts.add("India"); 
        ts.add("Australia"); 
        ts.add("South Africa"); 

        System.out.println(ts); 

    }
};