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
       else
        return  false;
    }


    List<T> getIntersectList (Collection<? extends T> c){

        List<T> temp=new SpecList<T>();

        if(this.size()!=0 && c.size()!=0) {


               for (int i = 0; i < this.size(); i++) {
                    if (c.contains(this.get(i))) {
                        temp.add(this.get(i));
                    }
                }
        }
        return temp;
    }


    List<T> sortList(int a)
    {



       for(int ii =1; ii <= this.size() -1 ;ii++) {


           for (int i = 0; i < this.size() - ii; i++) {

               //some classes compareTo return different value of -1,0,1.
               //So if compareTo returns -20, it's small. So
               //var is assigned -1.

               int val =  this.get(i).compareTo(this.get(i + 1));

               if(val < -1)
                   val=-1;
               else if(val>1)
                   val=1;

               if (val == a  ) {

                   T temp = this.get(i);
                   this.set(i, this.get(i + 1));
                   this.set(i + 1, temp);


               }
           }


       }

        return this;

    }



}
