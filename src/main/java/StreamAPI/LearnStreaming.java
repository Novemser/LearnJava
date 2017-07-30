package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Alibaba Group
 * Created by 晨烛 on 2017/7/29.
 */
public class LearnStreaming {
    private Stream<String> streamConstruct() {
        // 1. Individual values
        Stream<String> stream = Stream.of("a", "b", "z");
        // 2. Arrays
        String[] strArray = new String[]{"a", "b", "c", "我屮艸芔茻", "Computer Science"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        // 3. Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        return stream;
    }

    private List<String> neededString(Stream<String> stream) {
        return stream.filter(str -> str.contains("c")).collect(Collectors.toList());
    }

    private Stack toStack(Stream stream) {
        return (Stack) stream.collect(Collectors.toCollection(Stack::new));
    }

    private List<String> toUpperCase(List<String> wordList) {
        return wordList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    private String toString(Stream stream) {
        return stream.collect(Collectors.joining()).toString();
    }

    private void numberDataStream() {
//        IntStream.of(new int[]{1, 3, 5}).forEach(System.out::println);
//        IntStream.range(0, 100).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }

    private void streamFilterMap() {
        Stream.of("one", "two", "three", "four").parallel().filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e)).forEach(System.err::println);
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
//        LearnStreaming streaming = new LearnStreaming();
////        streaming.numberDataStream();
//        String res = streaming.toString(streaming.streamConstruct());
//        Stack stack = streaming.toStack(streaming.streamConstruct());
////        System.out.println(res);
//        List<String> list = new ArrayList<>();
//        list.add("kmads");
//        list = streaming.toUpperCase(list);
//        System.out.println(streaming.neededString(streaming.streamConstruct()));
        print("sad");
        System.out.println(getLength("aooji"));
    }

    public static int getLength(String text) {
        return Optional.ofNullable(text).map(String::length).orElse(-1);
    }

    /**
     *
     * @param text hehe
     */
    public static void print(String text) {
        Optional.ofNullable(text).ifPresent(str -> System.out.println("asdjasidjasidijoas" + str));
    }
}
