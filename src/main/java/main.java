import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sefa on 6.3.2016.
 */
public class main {


    public static void main(String args[]){

        SpecList<Integer > specList= new SpecList<Integer>();

        specList.add(-2);
        specList.add(5);
        specList.add(1);
        specList.add(3);


        System.out.println(specList);

        specList.sortList(-1);
        System.out.println(specList);
        specList.sortList(1);
        System.out.println(specList);

        List<Integer> tmp =new ArrayList<Integer>();
        List<String> temp=new LinkedList<String>();
        temp.add("sefa");
        temp.add("bb");
        temp.add("sefa2");

        tmp.add(3);
        tmp.add(2);
        tmp.add(0);
        System.out.println(tmp);
        SpecList<String > specList1= new SpecList<String>();

        specList1.add("sefa");
        specList1.add("sefasdaa");
        specList1.add("sefa");

        specList1.add("sefa2");
        specList1.add("sefa1");
        specList1.add("sef3");
        specList1.add("sef3sadasd");
        specList1.sortList(-1);
        System.out.println(specList1);
        specList1.sortList(1);
        System.out.println(specList1);
        temp=specList1.getIntersectList(temp);
        System.out.println(temp);

    }
}
