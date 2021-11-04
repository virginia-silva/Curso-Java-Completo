package application;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("jorge");
        list.add("pedro");
        list.add("lucia");
        list.add(2,"marcos");

        System.out.println("Quantos itens tem a lista: ");
        System.out.println(list.size());

        System.out.println("********");
        System.out.println();



        for (String x : list) {
            System.out.println(x);

            list.remove(1);
            //list.removeIf(x -> x.charAt(0) == 'M');
        }
    }
}
