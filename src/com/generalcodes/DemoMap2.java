package com.generalcodes;

import java.util.*;

class Department {
    String username,password,brand_name,switch_name;
    int slider_value;
    public Department(String username, String password, String brand_name, String switch_name, int slider_value){
        this.username=username;
        this.password=password;
        this.brand_name=brand_name;
        this.switch_name=switch_name;
        this.slider_value=slider_value;
    }
}
public class DemoMap2
{
    public static void main(String args[])
    {
        Map<Integer, Department>map=new LinkedHashMap<>();
        Department d1=new Department("Himansu","verizon","13a","ericson",30);
        Department d2=new Department("sudhansu","apple","12a","ios",7);
        Department d3=new Department("rahul","blackberry","11a","fire",9);
        map.put(1,d1);
        map.put(2,d2);
        map.put(3,d3);

        for(Map.Entry<Integer, Department>entry:map.entrySet())
        {
            int key=entry.getKey();
            Department d=entry.getValue();
            System.out.println(key+"Details");
            System.out.println(d.username+" "+d.password+" "+d.brand_name+" "+d.switch_name+" "+d.slider_value);

        }
    }

}