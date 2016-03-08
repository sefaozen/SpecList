import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class SpecList<T extends Comparable> extends LinkedList<T> {


    public SpecList() {
        super();
    }

    boolean addAllAtHead(Collection<? extends T> c){


       if(c.size()!=0) {
           this.addAll(0,c);
           return true;
       }
       else{
           System.out.println("Member not found\n");
           return  false;
       }

    }


    List<T> getIntersectList (Collection<? extends T> c){

        List<T> temp=new SpecList<T>();

        if(this.size()!=0 && c.size()!=0) {


               for (int i = 0; i < this.size(); i++) {
                    if (c.contains(this.get(i))) {
                       if(!temp.contains(this.get(i))) // for unique
                                temp.add(this.get(i));
                    }
                }
        }
        else{
            System.out.println("Null object. Intersect is null. Returns null list\n");
            return temp;
        }
        return temp;
    }


    List<T> sortList(int a) {


        if(this.size()!=0){

            List<T> tempList = new SpecList<T>();
            tempList.addAll(0, this);

            for (int ii = 1; ii <= this.size() - 1; ii++) {


                for (int i = 0; i < this.size() - ii; i++) {

                    //some classes compareTo return different value of -1,0,1.
                    //So if compareTo returns -20, it's small. So
                    //var is assigned -1.

                    int val = tempList.get(i).compareTo(tempList.get(i + 1));

                    if (val < -1)
                        val = -1;
                    else if (val > 1)
                        val = 1;

                    if (val == a) {

                        T temp = tempList.get(i);
                        tempList.set(i, tempList.get(i + 1));
                        tempList.set(i + 1, temp);


                    }
                }


            }
            return tempList;
         }
        else {
            System.out.println("Object has no member. Returns null");
            return this;
        }


    }


    @Override
    public String toString() {

        String str="";
        for(int i =0; i < this.size(); i++)
            str+="Element "+i+1+": "+this.get(i)+"\n";

        return str;
    }
}
