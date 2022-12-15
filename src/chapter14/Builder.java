package chapter14;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello, how are you?");
        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n",
                builder.toString(), builder.length(), builder.capacity());

        builder.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", builder.capacity());

        builder.setLength(6);
        System.out.printf("New length = %d%nbuffer = %s%n%n",
                builder.length(), builder.toString());

        System.out.println("method builder");
        System.out.printf("The capacity is %d%nthe length is %d%nthe difference between%nthe capacity and the length is always %d%n", builderCapacity(), buildersLength(), builderCapacity() - buildersLength());


    }

    public static int builderCapacity() {

        StringBuilder builds = new StringBuilder("Come to think of it, I know the length and capacity of this builder");
        return builds.capacity();
    }
    public static int buildersLength() {
        StringBuilder builds = new StringBuilder("Come to think of it, I know the length and capacity of this builder");
        return builds.length();
    }
}