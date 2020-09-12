package site.wentailai.example.pawnMove.simplesample;

/**
 * User: libingkui
 * Date: 2020/9/11
 * Description:
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 123;
        Integer c = 321;
        Integer b = 123;
        Integer d = 321;
        Integer di = 321;
        System.out.println(a == b);
        System.out.println(b == a);

        System.out.println(c == d);
        System.out.println(d == c);

        System.out.println(b +d == a + c);


    }
}
