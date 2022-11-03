package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student[] student={new Student("sangti",12,100),new Student("khenou",11,120),
        new Student("angjei",13,140),new Student("jaitok",14,150),
        new Student("phongle",15,160)};

        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>(Arrays.asList(student));
        //return the HashSet object

        System.out.println("studentSet = " + studentSet);
        System.out.println("studentSet.size() = " + studentSet.size());

        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        TreeSet<String> treeSet=new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Student student=null;
        Iterator<Student> iterator=studentSet.iterator();
        while (iterator.hasNext())
        {
            student=iterator.next();
            treeSet.add(student.getName());
        }
        //get all the name and add it inside the TreeSet object
        System.out.println("treeSet = " + treeSet);
        //return the TreeSet object;
        return treeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>

        //Use Iterator object of type <Student>to iterate through the studentSet

        //retrieve the Student object from the iterator

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

        Map<String,Integer> studentMap=new HashMap<>();
        Integer average=0;
        for (Student student : studentSet) {
            average=student.getTotalMarks()/6;
            studentMap.put(student.getName(),average);
        }
        System.out.println("studentMap = " + studentMap.entrySet());
        return studentMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));

    }


}
