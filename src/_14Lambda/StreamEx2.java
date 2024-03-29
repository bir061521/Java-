package _14Lambda;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"),new File("Ex1.bak"), new File("Ex2.java"),new File("Ex1")};

        Stream<File>fileStream = Stream.of(fileArr);

        Stream<String>filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName).filter(s->s.indexOf('.')!=-1).map(s->s.substring(s.indexOf('.')+1)).map(String::toUpperCase).distinct().forEach(System.out::println);

        System.out.println( );
    }



}
