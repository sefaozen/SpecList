import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by test on 7.3.2016.
 */
public class SpecListTest {

    @Test
    public void testAddAllAtHeadInteger() throws Exception {

        SpecList<Integer > specList= new SpecList<Integer>();

        specList.add(-2);
        specList.add(5);

        List<Integer> add=new ArrayList<Integer>();
        add.add(1);
        add.add(2);

        specList.addAllAtHead(add);

        List<Integer> expected=new SpecList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(-2);
        expected.add(5);
        assertEquals(expected,specList);


    }

    @Test
    public void testAddAllAtHeadString() throws Exception {

        SpecList<String > specList= new SpecList<String>();

        specList.add("test0");
        specList.add("test1");

        List<String> add=new ArrayList<String>();
        add.add("test2");
        add.add("test3");

        specList.addAllAtHead(add);

        List<String> expected=new SpecList<String>();
        expected.add("test2");
        expected.add("test3");
        expected.add("test0");
        expected.add("test1");
        assertEquals(expected,specList);

    }
    @Test
    public void testAddAllAtHeadDouble() throws Exception {
        SpecList<Double > specList= new SpecList<Double>();

        specList.add(0.3);
        specList.add(1.5);

        List<Double> add=new ArrayList<Double>();
        add.add(7.5);
        add.add(1.7);

        specList.addAllAtHead(add);

        List<Double> expected=new SpecList<Double>();
        expected.add(7.5);
        expected.add(1.7);
        expected.add(0.3);
        expected.add(1.5);
        assertEquals(expected,specList);

    }

    @Test
    public void testGetIntersectListInteger() throws Exception {

        SpecList<Integer > specList= new SpecList<Integer>();

        specList.add(-2);
        specList.add(5);

        List<Integer> add=new ArrayList<Integer>();
        add.add(1);
        add.add(2);

        SpecList<Integer> expected=new SpecList<Integer>();

        assertEquals(expected,specList.getIntersectList(add));

    }
    @Test
    public void testGetIntersectListString() throws Exception {


        SpecList<String > specList= new SpecList<String>();

        specList.add("test0");
        specList.add("test1");

        List<String> add=new ArrayList<String>();
        add.add("test1");
        add.add("test3");



        List<String> expected=new SpecList<String>();
        expected.add("test1");
        assertEquals(expected,specList.getIntersectList(add));
    }
    @Test
    public void testGetIntersectListDouble() throws Exception {


        SpecList<Double > specList= new SpecList<Double>();

        specList.add(0.3);
        specList.add(1.5);
        specList.add(7.5);
        specList.add(1.7);

        List<Double> add=new ArrayList<Double>();
        add.add(7.5);
        add.add(1.7);



        List<Double> expected=new SpecList<Double>();
        expected.add(7.5);
        expected.add(1.7);

        assertEquals(expected,specList.getIntersectList(add));
    }

    @Test
    public void testSortListInteger() throws Exception {

        SpecList<Integer > specList= new SpecList<Integer>();

        specList.add(-2);
        specList.add(5);
        specList.add(1);
        specList.add(3);
        specList.sortList(1);

        List<Integer> expected=new ArrayList<Integer>();
        expected.add(-2);
        expected.add(1);
        expected.add(3);
        expected.add(5);

        assertEquals(expected,specList);
    }
    @Test
    public void testSortListString() throws Exception {

        SpecList<String > specList= new SpecList<String>();

        specList.add("test0");
        specList.add("test2");
        specList.add("test5");
        specList.add("test1");
        specList.add("test3");
        specList.add("test4");

        specList.sortList(1);

        List<String> expected=new SpecList<String>();
        expected.add("test0");
        expected.add("test1");
        expected.add("test2");
        expected.add("test3");
        expected.add("test4");
        expected.add("test5");


        assertEquals(expected,specList);
    }
    @Test
    public void testSortListDouble() throws Exception {

        SpecList<Double > specList= new SpecList<Double>();

        specList.add(7.5);
        specList.add(1.7);
        specList.add(0.3);
        specList.add(1.5);

        specList.sortList(1);

        List<Double> expected=new SpecList<Double>();
        expected.add(0.3);
        expected.add(1.5);
        expected.add(1.7);
        expected.add(7.5);

        assertEquals(expected,specList);

    }
}