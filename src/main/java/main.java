import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sefa on 6.3.2016.
 */
public class main {


    public static void main(String args[]){

        SpecList<Integer > specList= new SpecList<Integer>();
        List<Integer > outputList= new SpecList<Integer>();

        specList.add(-2);
        specList.add(5);
        specList.add(1);
        specList.add(3);


        System.out.println("List1(SpecList\n"+specList);

        outputList= specList.sortList(-1);
        System.out.println("List1 Decreasing\n"+outputList);
        outputList= specList.sortList(1);
        System.out.println("List1 Increasing\n"+outputList);

        List<Integer> tmp =new ArrayList<Integer>();

        tmp.add(3);
        tmp.add(2);
        tmp.add(0);
        System.out.println("List2(Arraylist)\n"+tmp);

        outputList=specList.getIntersectList(tmp);
        System.out.println("IntersectList is between List1 and List2\n"+outputList);

        specList.addAllAtHead(tmp);
        System.out.println("List2 added to List1\nList1\n"+specList);

        outputList=specList.getIntersectList(tmp);
        System.out.println("IntersectList is between new List1 and List2\n"+outputList);



    }
}
