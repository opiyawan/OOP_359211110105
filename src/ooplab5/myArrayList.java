package ooplab5;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList list = new ArrayList();
        String name = "nan";
        list.add(name);
        System.out.println(list);
        list.add("prim");
        list.add("kik");
        System.out.println(list);
        list.add(2, "oil");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("prim");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("oil"));
    }//main
}//class