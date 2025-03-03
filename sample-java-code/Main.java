//some comments ...
/**
 * longer multiline comments
 * line 2
 * line 3
 * etc ...
 */

import ca.mohaghegh.navid.Animal;
import ca.mohaghegh.navid.Dog;
import ca.mohaghegh.navid.Lovable;
import ca.mohaghegh.navid.Puppy;

import java.lang.String; //not really needed
import java.lang.*;
import static java.lang.System.out;
import java.util.*; //not the best practice doing a shotgun: .*
import java.util.stream.Collectors; //why streams?

/**
 * A class representing week days
 */
class Week {
    public static String sayHello(String input) {
        return "Hello Week of " + input;
    }

    enum Day { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday };
    Day startDay = Day.Monday ;
}

/**
 * We should improve this implementation!!
 * @FIXME please improve the code
 */

class Student
{
    public Student()
    {
        this.age = 0;
    }

    public final static int sampleFinalValue = 100; //can no longer change this value later on

    private String name = ""; //do not do "public" attributes, we discussed why ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private int age = 0;
    private long id = 0;

    /**
     * nonstatic method that return a Hello greetings
     * @param name which we want to say hello to
     * @return a greeting message
     */
    public String sayHello(String name)
    {
        //what is the difference between this method and:
        //  public static String sayHello(String name)
        //    that is mentioned in below codes?
        return "Hello " + name;
    }



    public String sayHello(String name, int age)
    {
        return "Hello! My name is: " + name + ", I am " + age + " years old.";
    }





    }

public class Main {

    /**
     * static helper method to print a separator line
     * to better distinguish the outputs of each sections of the code
     */
    public static void printSeparatorLine()
    {
        out.println("--------------------------------------");
    }

    /**
     * static method that return a Hello greetings
     * @param name which we want to say hello to
     * @return a greeting message
     */
    public static String sayHello(String name)
    {
        return "Hello " + name + "!";
    }

    public static void main(String[] args)
    {
        out.println("Value of badge 100 is: " + Student.sampleFinalValue);

        Student s001 = new Student();
        s001.setName("Navid");
        s001.setAge(48);
        s001.setId(10000001);
        System.out.println( s001.sayHello( s001.getName() ) );
        System.out.println( s001.sayHello( s001.getName(), s001.getAge() ) );


        Dog d1 = new Dog("Ronny1");
        Animal d2 = new Dog("Ronny2");
        Lovable d3 = new Dog("Ronny3");

        System.out.println("d2 name is:" + d2.getName());

        System.out.println(Week.sayHello("01"));

        java.lang.String myString = new String("My String");

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("====== Loop Examples Start ======");
        //do-while loop example
        int i1 = 0;
        do
        {
            //printf("In the while loop and value of i1 is %03d \n", i1);
            System.out.println(String.format("In the do-while loop and value of i1: %03d", i1) );
            i1 = i1 +1; //i1++;
        } while (i1 < 5);

        printSeparatorLine();
        //for loop example
        for (int i2 = 0; i2 < 5; i2++)
        {
            out.println(String.format("In the for loop and value of i2: %06d", i2));
        }
        printSeparatorLine();
        //whie loop example
        int i3 = 0;
        while (i3<5) {
            out.println(String.format("In the while loop and value of i3: %d", i3));
            i3++;
        }
        out.println("====== Loop Examples End ======");

        out.println("====== Conditions, If-Else and Switch Examples Start ======");

        boolean isChecked1 = true;
        boolean isChecked2 = false;

        out.println(isChecked1 ? "Checked flag1 is set to true" : "Checked flag1 is not set");  // output: Checked flag1 is set to true

        printSeparatorLine();  ////////////////////////////////////

        if (isChecked1) {
            out.println("Checked flag1 is set to true");
        }
        else if (isChecked2) {
            out.println("Checked flag2 is set to true");
        }
        else
            out.println("Checked flags are not set");


        printSeparatorLine(); ////////////////////////////////////

        int x = 5;
        switch (x)
        {
            case 5:
                out.println("Value of x is 5");
                break;
            case 10:
                out.println("Value of x is 10");
                break;
            case 15:
                out.println("Value of x is 15");
                break;
            default:
                out.println("Unknown value!");
                break;
        }

        printSeparatorLine();  ////////////////////////////////////

        switch (x) {
            case 5 -> out.println("Value of x is 5");
            case 10 -> out.println("Value of x is 10");
            case 15 -> out.println("Value of x is 15");
            default -> throw new  java.lang.IllegalArgumentException("Unknown value!");
        };

        out.println("====== Conditions, If-Else and Switch Examples End ======");

        out.println("====== List, Set, and Map Examples Start ======");
        List<String> myList1 = Arrays.asList("StringA1", "StringA2", "StringA3"); //new ArrayList<String>();
        List<String> myList2 = new ArrayList<String>();
        myList2.add("StringB1");
        myList2.add("StringB2");
        myList2.add("StringB3");
        myList2.add("StringB4");
        myList2.add("StringB0");
        myList2.add("StringC0");

        out.println(String.format("myList1 index 1 holds: %s", myList1.get(1)) );
        out.println(String.format("myList2 index 2 holds: %s", myList2.get(2)) );

        printSeparatorLine();
        myList2.stream()
                .filter(string -> string.startsWith("StringB"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(out::println);

        printSeparatorLine();
        printSeparatorLine();
        List<String> myList3 = List.of("StringC1", "StringC2", "StringC3", "StringC1");

        myList3.stream().filter(string -> string.startsWith("StringC"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(out::println);
        printSeparatorLine();
        printSeparatorLine();

        Set<String> mySet1 = Set.of("StringD1", "StringD2", "StringD3");

        Map<String, String> myMap1 = Map.of(
                "K01", "StringE1",
                "K02", "StringE2",
                "K03", "StringE3",
                "K04", "StringE1",
                "k05", "StringE5");

        myMap1.values().stream()
                .filter(string -> string.startsWith("StringE"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(out::println);

        printSeparatorLine();
        List<String> myMap1DistinctValues = myMap1.values().stream()
                .distinct()
                .collect(Collectors.toList());
        myMap1DistinctValues.stream().forEach(out::println);

        printSeparatorLine();
        var lowerCaseKeys = myMap1.keySet().stream()
                .filter(j -> j.toLowerCase().startsWith("j"))
                .findFirst()
                .orElse(null);

        printSeparatorLine();
        printSeparatorLine();


        out.println((lowerCaseKeys != null && lowerCaseKeys.length() != 0) ?
                String.format("Found a lowercase key in the map: %s", lowerCaseKeys) :
                "All keys are good and in uppercase");

        out.println("====== List Examples End ======");

        Week myWeek = new Week();
        out.println(String.format("Start day of the week is %s", myWeek.startDay));
        myWeek.startDay = Week.Day.Saturday;
        out.println(String.format("Start day of the week is %s", myWeek.startDay));

        printSeparatorLine();
        ca.mohaghegh.navid.Animal puppy01 = new Puppy("Ronnie");
        puppy01.setAge(1);
        out.println(String.format("Our puppy name is %s and age is %d",puppy01.getName(), puppy01.getAge()));
    }
}




























/*
    Some notes:

    Who is Dr. Java?: James Gosling

    What are JVM, JDK/JRE and Bytecode?

    Java versions? https://en.wikipedia.org/wiki/Java_version_history

    Java promised: write once run anywhere! ... and it is not so true:
    some of the not too popular processors are losing the support of modern JREs:
     https://openjdk.java.net/jeps/381

    Be aware that many major projects are stuck at Java 7!! (also refer as 1.7):
     https://developer.android.com/studio/write/java8-support
        Note that LTS versions are: JDK 8, 11, and soon 17 ...

    Keywords: abstract, assert, boolean, break, byte, case, catch, char,
    class, const, continue, default, do, double, else, enum, extends,
    final, finally, float, for, goto, if, implements, import, instanceof,
    int, interface, long, native, new, package, private, protected, public,
    return, short, static, strictfp, super, switch, synchronized, this,
    throw, throws, transient, try, void, volatile, while

    Read more examples: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */