package List.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(45);
        list.add(50);
        list.add(60);
        list.add(65);

        System.out.println("Size: "+ list.size());

        for (Integer x : list){
            System.out.println(x);
        }

        list.add(2, 20);

        list.remove(5);

        System.out.println("----------------");
        List<Integer> result = list.stream().filter(x -> x.equals(60)).collect(Collectors.toList());
        for (Integer x : result){
            System.out.println(x);
        }
    }
}
