import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {


    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2,6));
        points.add(new Point(4,8));
        points.add(new Point(9,2));
        points.add(new Point(5,6));

        int toltalSum =points.stream()
                .flatMapToInt(point -> Arrays.stream(new int[]{point.getX(), point.getY()}))
                .sum();
        // in ra tong cac  hoanh do tren 5
        int sumx2 =points.stream()
                .filter(point -> point.getX()>5)
                .mapToInt(Point::getX)
                .sum();

        // tinh tong toan bo x^2 +1-y va hoanh do tren 5
        int sumx3 =points.stream()
                .filter(point -> point.getX()>5)
                .mapToInt(p->{
                    return p.getX()* p.getX() + 1 -p.getY();
                })
                .sum();


        // in ra danh sach x+y >7
     points.stream()
                        .filter(p -> (p.getY() +p.getX()>7))
                .forEach(System.out::println);

    // tinh tich cac gia tri cua 1/(x^2 +y) cho tat ca cac point
            double toatalProd = points.stream()
                            .mapToDouble(p->{
                                int x =p.getX();
                                int y= p.getY();
                                double tmp =x*x +y;
                                return 1.0/tmp;
                            })
                                    .reduce(1.0,(res,item)->res*item);




        System.out.println(toltalSum);
        System.out.println(sumx2);
        System.out.println(sumx3);
        System.out.println(toatalProd);

    }


}
