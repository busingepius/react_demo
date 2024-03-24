/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 09/03/2024
 * Time : 08:37
 * Project Name : streams
 */
package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );
//
//        Supplier<String> sup = Movie::getLikesAndTitle;
//
//        List<Movie> filteredList = movies.stream()
//                .filter(movie -> movie.getLikes() > 20)
//                .toList();
//
//        long countfilteredList = movies.stream()
//                .filter(movie -> movie.getLikes() > 20)
//                .count();
//
//        filteredList.forEach((System.out::println));
//
////        System.out.println(countfilteredList);
//
//        // CREATING STREAMS
//
//        /* 1. From collections
//        var list = new ArrayList<Object>();
//        Stream<Object> stream = list.stream();
//         */
//
//        /* 2. From arrays
//        Integer[] numbers = {1,2,3,4};
//        Stream<Integer> stream = Arrays.stream(numbers);
//         */
//
//        /* 3. From an arbitrary number of objects
//        Stream<Integer> stream = Stream.of(1,2,3,4);
//         */
//
//        /* 4. Infinite/finite streams
//
//         */
//
//        Supplier<Double> supplier = new Supplier<Double>() {
//            @Override
//            public Double get() {
//                return Math.random();
//            }
//        };
//
//        Stream<Double> stream = Stream.generate(supplier).limit(7);
//
//        Consumer<Double> consumer = new Consumer<Double>(){
//            @Override
//            public void accept(Double item){
//                System.out.println(item);
//            }
//        };
//
////        stream.forEach(consumer);

//        // map(Function)
//        Function<Movie,String> function = Movie::getTitle;
//        Stream<String> movieTitlesStream = movies.stream()
//                .map(function);
//        List<String> listOfTitles = movieTitlesStream.collect(Collectors.toList());
//        for(String s: listOfTitles) System.out.println(s);

//        // flatMap(Function)
//        List<Integer> listOfIntegers1 = List.of(1,2,3,4);
//        List<Integer> listOfIntegers2 = List.of(6,7,8,9);
//        Stream<List<Integer>> streamOfLists = Stream.of(listOfIntegers1,listOfIntegers2);
//        Function<List<Integer>,Stream<Integer>> function = (list)-> list.stream();
//        Stream<Integer> streamOfIntegers = streamOfLists.flatMap(function);
//        List<Integer> list = streamOfIntegers.collect(Collectors.toList());
//        Consumer<Integer> consumer = new Consumer<Integer>(){
//            @Override
//            public void accept(Integer n){
//                System.out.println(n);
//            }
//        };
//        list.forEach(consumer);

//        // filtering::- filter(predicate)
//        Predicate<Movie> predicate = (Movie movie)-> movie.getLikes() > 15;
//        Stream<Movie> streamOfFilteredMovies = movies.stream()
//                .filter(predicate);
//        for(Movie movie: streamOfFilteredMovies.collect(Collectors.toList())) System.out.println(movie);

//        // Slicing::- limit(log)/skip(long)/takeWhile(Predicate)/dropWhile(Predicate)
//        Stream<Movie> streamOfLimitedMovies = movies.stream().limit(1);
//        for(Movie movie: streamOfLimitedMovies.collect(Collectors.toList())) System.out.println(movie);

        /** Pagination
         skip(20) = skip((page - 1) * pageSize);
         limit(10) = limit(pageSize);
         */

//        // Slicing::- skip(long)/takeWhile(Predicate)/dropWhile(Predicate)
//        Stream<Movie> streamOfSkippedToMovies = movies.stream().skip(1);
//        for (Movie movie : streamOfSkippedToMovies.collect(Collectors.toList())) System.out.println(movie);

//        // Slicing::- takeWhile(Predicate)/dropWhile(Predicate)
//        // stops when it is false
//        Predicate<Movie> predicate = new Predicate<Movie>() {
//            @Override
//            public boolean test(Movie movie) {
//                return movie.getLikes() < 21;
//            }
//        };
//        Stream<Movie>  streamOfMovies = movies.stream().takeWhile(predicate);
//        for(Movie movie: streamOfMovies.collect(Collectors.toList())) System.out.println(movie);

        // Slicing::- dropWhile(Predicate)
        Stream<Movie> streamOfMovies = movies.stream().dropWhile((movie) -> movie.getLikes() < 21);
        for (Movie movie : streamOfMovies.collect(Collectors.toList())) System.out.println(movie);

    }
}
class Streams{
    public static void main(String args[]){

        List<Integer> list = List.of(19,7,23,99);
        list.forEach((item)->System.out.println(item));

        Stream<String> stream1 = Stream.of("Eye","Like","Java","Stream","API");
        stream1.forEach(System.out::println);

        Stream<Integer> streams2 = Stream.iterate(0,n->n+2);
        streams2.limit(5).forEach(System.out::println);

        Stream<Integer> stream3 = Stream.iterate(1,n ->n+2);
        stream3.skip(4).limit(4).forEach(System.out::println);

        List<Integer> list1 = List.of(1,2,3,4);
        List<Integer> list2 = List.of(6,7,8,9);
        Stream.of(list1,list2).flatMap(l -> l.stream()).forEach(System.out::println);
    }
}

class Reducers{
    public static void main(String[] args){
        Stream strings  = Stream.of("A","good","day","to","write","some","Java");
        strings.sorted(
//                new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        }.reversed()
//                Comparator.reverseOrder()
                Comparator.comparing(String::length)
        ).forEach(System.out::println);
//        var st = strings.reduce("",(s,t)->(STR."\{s} \{t}"));
//        System.out.println(st);
    }
}