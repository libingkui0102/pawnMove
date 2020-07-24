package site.wentailai.example.pawnMove.simplesample;

import reactor.core.publisher.Flux;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: libingkui
 * Date: 2020/7/24
 * Description:
 */
public class MultiplicationTable {
    /**
     * 打印99乘法表, 平常写法
     * @return
     */
    public String getMultiplicationTable1() {
        String content = "";
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++) {
                content = content + " " + j + " * " + i + " = " + i * j;
            }
            content = content + "\n";
        }
        return content;
    }
    /**
     * 打印99乘法表, Stream写法
     * @return
     */
    public String getMultiplicationTable2() {

        return IntStream.rangeClosed(1, 9)
                .mapToObj(
                        i -> IntStream.rangeClosed(1, i)
                                .mapToObj(j -> " " + j + " * " + i + " = " + i * j)
                                .collect(Collectors.joining(""))
                )
                .collect(Collectors.joining("\n"));
    }
    /**
     * 打印99乘法表, 反应式编程写法
     * @return
     */
    public Flux<String> getMultiplicationTable3() {
        return Flux.range(1, 9)
                .flatMap(x -> Flux.range(1, x)
                        .reduce("", (a, i) -> a + i + " * " + x + " = " + x * i + " ")
                );
    }
     /**
     * 打印99乘法表, 递归（装逼）写法
     * @return
     */
     private String getMultiplicationTable4() {
         String content = "";
         for(int i = 1; i <= 9; i++) {
             content = content + getMultiplicationTable4Onrecord(i, i) + "\n";
         }
         return content;
     }
    private String getMultiplicationTable4Onrecord(int i, int j) {
        if(i == 1) {
            return "1 * " + j + " = " + j;
        }
        else {
            return getMultiplicationTable4Onrecord(i - 1, j) + " " + i + " * " + j + " = " + i * j;
        }
    }

    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        System.out.println((m.getMultiplicationTable1()));
        System.out.println();
        System.out.println(
                m.getMultiplicationTable2()
        );
        System.out.println();
        m.getMultiplicationTable3()
                .subscribe(System.out::println);

        System.out.println();
        System.out.println(m.getMultiplicationTable4());

    }
}