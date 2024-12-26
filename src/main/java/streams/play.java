package streams;


import java.util.*;
import java.util.stream.Collectors;

public class play {

    public static void main(String[] args) {

List<String>  t = Arrays.asList("kr","an","thh", "ii.","ii.");
        List<Object> k = Arrays.asList(

                1,               // Integer
                'b',             // Character ('b' -> 2)
                "three",         // String ("three" -> 3)
                4,               // Integer
                'g',             // Character ('g' -> 7)
                5,               // Integer
                'd',             // Character ('d' -> 4)
                "nine",          // String ("nine" -> 9)
                7,               // Integer
                'f',             // Character ('f' -> 6)
                "six",           // String ("six" -> 6)
                "eight",         // String ("eight" -> 8)
                "ten",           // String ("ten" -> 10)
                10               // Integer

        );

        Map<String, Integer> wordtonumbermap = new LinkedHashMap<>();
        wordtonumbermap.put("one", 1);
        wordtonumbermap.put("two", 2);
        wordtonumbermap.put("three", 3);
        wordtonumbermap.put("four", 4);
        wordtonumbermap.put("five", 5);
        wordtonumbermap.put("six", 6);
        wordtonumbermap.put("seven", 7);
        wordtonumbermap.put("eight", 8);
        wordtonumbermap.put("nine", 9);
        wordtonumbermap.put("ten", 10);
        wordtonumbermap.put("eleven", 11);


        //   wordtonumbermap.forEach((key,value) -> System.out.println(key + value));


        List<Integer> result  = k.stream().map(e -> {

                    if (e instanceof Integer) {

                        Integer v = (Integer) e;

                        if (v % 2 == 0) {
                            return v;
                        }

                        return 0;
                    } else if (e instanceof String) {

                        Integer number = wordtonumbermap.get(e.toString().toLowerCase());


                        if (number != null && number % 2 == 0) {
                            return number;
                        }

                        try {
                            Integer parsedvalue = Integer.parseInt(e.toString());

                            return parsedvalue % 2 == 0 ? parsedvalue : 0;

                        } catch (NumberFormatException ex) {
                            return 0;
                        }


                    } else if (e instanceof Character) {


                        char ch = (Character) e;
                        if (Character.isLetter(ch)) {


                            Integer j = Character.toLowerCase(ch) - 'a' + 1;

                            if (j % 2 == 0) {

                                return j;
                            }


                        }
                        return 0;

                    } else

                        return 0;


                })
                .distinct()
                .sorted()
                .collect(Collectors.toList());




      boolean exists =   result.stream().anyMatch(n -> n.equals(8));


      System.out.println(exists);



     Optional<Integer> max =  result.stream().max(Integer::compareTo);
      Integer maxvalue  =  max.orElse(-1);

      System.out.println("max value : " + maxvalue);



  String f =    t.stream().map(String::toUpperCase).distinct().collect(Collectors.joining());
System.out.println(f);

OptionalInt    q = t.stream().map(String::toUpperCase).mapToInt(String::length).max();
Integer maxvalue1 = q.orElse(-1);


System.out.println("MAXSTRING:" + maxvalue1);



        Optional<String>     ms = t.stream().map(String::toUpperCase).max(Comparator.comparing(String::length));


      String msv =   ms.get();

      System.out.println(msv);


    }



}