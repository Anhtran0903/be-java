import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> colors =new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");


        System.out.println(colors.get(0));

        colors.set(1,"yellow");

        colors.remove("red");
        System.out.println(colors);

        colors.remove(1);
        System.out.println(colors);

        for(String color :colors){
            System.out.println(color);
        }
    String[] colorArray = {"green","blue","red"};

        ArrayList<String> colorList =new ArrayList<>(Arrays.asList(colorArray));
        Collections.sort(colorList);


        Collections.sort(colorList, (s1,s2)->s1.compareTo(s2));
        System.out.println(colorList);


        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3,7));
        points.add(new Point(3,6));
        points.add(new Point(5,5));
        points.add(new Point(8,5));
        Comparator<Point> x_Y_compare =new Comparator<Point>() {
            @Override
     //       public int compare(Point o1, Point o2) {
        //        return Integer.compare(o1.getX(), o2.getY());
        //    }
        //    public int compare(Point p1, Point p2) {
         //       int tmp =Integer.compare(p1.getX(), p2.getY());
          //      if (tmp ==0){
          //          return Integer.compare(p1.getX(), p2.getY());
           //     }
           //     return tmp;
        //    }
            public int compare(Point p1, Point p2){
                return Integer.compare(p1.getX()+ p1.getY(), p2.getX()+ p2.getY());

            }

        };
        Collections.sort(points,x_Y_compare);
        for (Point p : points){
            System.out.println(p);
        };

        Consumer<Point> printMessage =p -> {
            if (p.getX()>p.getY()){
            System.out.println(p.getY() - p.getX());
            }else{
                System.out.println(p.getY() + p.getX());
            }
        };
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        points.forEach(printMessage);
//         stream
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        points.stream()

                .filter(p->p.getX()>3)
                .forEach(System.out::println);

        for (Point a :points){
            if (a.getX()>3){
                System.out.println(a.toString());
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // predicate
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Predicate<Point> pre_x = point -> point.getX()>3;
        for(Point p : points){
            if(pre_x.test(p)){
                    System.out.println(p.toString());
            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.out.println("--------------------------------");
        List<String> names =  Arrays.asList("john","wech","Anna","Ann");

        names.stream()
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");
        List<String> filename = names.stream()
                .filter(name->name.endsWith("n"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filename);


        System.out.println("--------------------------------");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("--------------------------------");
        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,5,7);
        // tinh tong
        int tong = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("tong: "+tong);

//tinh trung binh

        double trungbing = numbers.stream()
                .mapToDouble(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("trung binh "+trungbing);

        // su dung reduce de tim tich
            double tich = numbers.stream()
                    .reduce(1,(kq,item)->kq + 1/item);
            System.out.println("tich: "+tich);

            int sum1 =numbers.stream()
                    .reduce(1,Integer::sum);
            System.out.println("tong reduce: "+sum1);


            List<List<String>> ListOfLists =Arrays.asList(
                    Arrays.asList("a","b","c"),
                    Arrays.asList("d","f","x"),
                    Arrays.asList("n","b","b")

            );
            List<String> combinedList = ListOfLists.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());

            System.out.println(combinedList);


    }




}
