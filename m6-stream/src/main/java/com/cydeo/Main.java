package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // creating stream from array
        String[] courses={"java","spring","agile"};

       Stream<String> coursesStream=  Arrays.stream(courses);

        // creating stream from collection
     List<String> coursesList=Arrays.asList("java","spring","agile");

     Stream<String>   coursesStreamList=coursesList.stream();

     List<Course> myCourses=Arrays.asList(
             new Course("java",120),
             new Course("DS",110),
             new Course("MS",120),
             new Course("Agile",130));

     Stream<Course>   myCoursesStream=myCourses.stream();





    }
}
