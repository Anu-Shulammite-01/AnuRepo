import java.util.*;

class Collections_Ex {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,23,34,43,44,89,90);
        System.out.println("The Array List is: "+list);
        
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Java");
        queue.offer("Python");
        queue.add("C++");
        queue.add("Javascript");
        System.out.println("Priority Queue is :"+queue);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.addFirst("Banana");
        list1.addLast("Orange");
        System.out.println("Linked List is :"+list1);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack using Deque is :"+stack);

        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Element1", 56);
        hashmap.put("Element2", 78);
        hashmap.put("Element3", 90);
        hashmap.putIfAbsent("Element4",77);
        hashmap.putIfAbsent("Element3",120);
        System.out.println("HashMap is :"+hashmap);

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1,"A");
        map1.put(4,"D");
        map1.put(2,"C");
        map1.put(3,"B");
        map1.putIfAbsent(5,"E");
        System.out.println("Linked HashMap is :"+map1);

        TreeMap<String,Integer> map2 = new TreeMap<>();
        map2.put("Zebra", 1);
        map2.put("Lion", 2);
        map2.put("Tiger", 3);
        map2.put("Monkey", 4);
        System.out.println("Tree Map is :"+map2);

        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Hi");
        set.remove("World");
        System.out.println("Hashset is :"+set);

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Onion");
        set1.add("Brinjal");
        set1.add("Tomato");
        set1.add("Carrot");
        System.out.println("Linked Hashset is :"+set1);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(-5);
        set2.add(10);
        set2.add(0);
        set2.add(5);
        System.out.println("Tree Set is :"+set2);

    }
}
