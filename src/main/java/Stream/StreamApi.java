package Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by my on 2017/2/12.
 */
public class StreamApi {



    @Test
    public void main(){


        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            list.add(Integer.valueOf(i));
        }

        System.out.println(list.stream().reduce(
                new StringBuilder(),
                (result,element)->
                        result=result.append(element)
                ,(u,t) -> t=u.append(t)));



       /* List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            list.add(Integer.valueOf(i));
        }

        System.out.println(list.stream().reduce(
                (result,element)->
                        result=result+element));

        System.out.println(list.stream().reduce(
                90,
                (result,element)->
                        result=result+element));


        System.out.println(list.stream().reduce(
                0,
                (result,element)->
                        result=result+element
                ,(u,t) -> t));

    }




    public static void main(String[] args) {
        List<List> l = new ArrayList();

        for (int i = 0; i <100 ; i++) {

            if (i<=30){
                List list = new ArrayList();
                list.add(1);
                l.add(list);
            }else if (30<i && i <= 60){
                List list = new ArrayList();
                list.add(2);
                l.add(list);
            }else {
                List list = new ArrayList();
                list.add(1);
                l.add(list);
            }
        }

        //l.stream().distinct().forEach(System.out::println);
        //l.stream().sorted().forEach(System.out::println);
        //l.stream().filter(n->(n>46)).forEach(System.out::println);
        //l.stream().mapToInt(n->Integer.valueOf(n.toString())).forEach(System.out::println);
        //l.stream().flatMap(n->n.keySet().stream()).forEach(System.out::println);
        //peek 对每个元素执行操作并返回一个新的 Stream
        /*List listStream = l.stream().peek(n->n.stream().filter(x->(Integer.valueOf(x.toString())>2))).collect(Collectors.toList());
        for (Object o:listStream){
            System.out.println(o);
        }*/
        //l.stream().limit(30).forEach(System.out::println);
        //l.stream().skip(30).forEach(System.out::println);
        /*if (ll.stream().allMatch(x->(Integer.valueOf(x.toString())>0))){
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/

        //l.stream().forEach(System.out::println);
    }


    @Test
    public void tt() {


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        nums.stream().filter(num -> num != null).
                distinct().mapToInt(num -> num).
                peek(e -> System.out.println(" first peek :" + e)).skip(2).limit(4)
                .peek(n -> System.out.println(" second peek :" + n)).sum();



       /* Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }*/





    }


}
