package Demo;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

interface Add {
    int sum(int a, int b);
}

interface Author{
    String name(String name);
}

public class Main {

    public static void main(String[] args) {

        //Add add = Integer::sum;

        Add add = (a, b) -> a + b;

        System.out.println(add.sum(1, 2));

        Author nm = (name)->name;
        System.out.println(nm.name("Ishan Nikeshala Nawarathna"));


        List<String> names = new ArrayList<>(List.of("LSEG", "IFS", "Google", "Open AI"));
//        names.sort(String::compareTo);
//        System.out.println(names);

//        names.stream().forEach(s-> System.out.print(" " + s + ","));
//        names.forEach(s-> System.out.print(" " + s + ","));
//        names.stream().sorted().forEach(a-> System.out.print(" " + a + ","));


    }

}
