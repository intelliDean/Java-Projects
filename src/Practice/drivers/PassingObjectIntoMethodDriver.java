package Practice.drivers;

import Practice.CircleWithStatic;
import Practice.PassingObjectIntoMethod;

public class PassingObjectIntoMethodDriver {
    public static void main(String[] args) {
        CircleWithStatic myCircle = new CircleWithStatic(5.0);

        // This is creating/instantiating an object and assigning the object to an object variable
        PassingObjectIntoMethod.printCircle(myCircle);

        //This is also the same thing as creating/instantiating an object of a class but not assigning it to an object variable
        PassingObjectIntoMethod.printCircle(new CircleWithStatic(2));

         PassingObjectIntoMethod.printCircle(new CircleWithStatic(7));

        PassingObjectIntoMethod.printCircle(new CircleWithStatic(-7));

    }
}
