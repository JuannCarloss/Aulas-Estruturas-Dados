import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class testList {

    public static void main(String[] args) {


        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");

        System.out.println(arraylist);

        arraylist.add(0, "a1");

        System.out.println(arraylist);

        boolean existe = arraylist.contains("a");

        if (existe) {
            System.out.println("este elemento existe na lista");
        } else {
            System.out.println("este elemento não está na lista");
        }

        int pos = arraylist.indexOf("b");

        if (pos > -1) {
            System.out.println("este elemento está na lista na posição: " + pos);
        } else {
            System.out.println("este elemento não esta na lista: " + pos);
        }

        System.out.println(arraylist.get(3));

        arraylist.remove(3);

        System.out.println(arraylist);

        System.out.println(arraylist.size());
    }
}