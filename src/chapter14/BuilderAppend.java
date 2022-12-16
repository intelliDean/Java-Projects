package chapter14;

public class BuilderAppend {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();
        buffer.append(objectRef).
                append(System.getProperty("line.separator"))
                .append(string).
                append(System.getProperty("line.separator"))
                .append(charArray).
                append(System.getProperty("line.separator"))
                .append(charArray, 0, 3)
                .append(System.getProperty("line.separator"))
                .append(booleanValue)
                .append(System.getProperty("line.separator"))
                .append(characterValue)
                .append(System.getProperty("line.separator"))
                .append(integerValue)
                .append(System.getProperty("line.separator"))
                .append(longValue)
                .append(System.getProperty("line.separator"))
                .append(floatValue)
                .append(System.getProperty("line.separator"))
                .append(doubleValue)
                .append(System.getProperty("line.separator"))
        .append(lastBuffer);

        System.out.printf("buffer contains%n%s%n", buffer.toString());

        String nah = new StringBuilder().append("come").append(" ").append(67).toString();
        System.out.println(nah);


        StringBuilder hay = new StringBuilder("come and see ");
        hay.append("the beautiful things ");
        hay.append("the Lord has done ");
        hay.append("in my life ");
        hay.append("I am forever grateful ");
        String printHay = hay.toString();

        System.out.println(printHay);
        System.out.println(hay);


        String man = "my name is Dan";
        System.out.println(man);

        StringBuilder name = new StringBuilder(man);
        name.append(" and I am 23 years old");

        man = name.toString();

        System.out.println(man);
    }
}