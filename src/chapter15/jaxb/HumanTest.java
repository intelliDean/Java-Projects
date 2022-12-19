package chapter15.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class HumanTest {
    public static void main(String... args) throws JAXBException {
        HumanBeing dean = new HumanBeing();     //create an object of the class
        dean.setName("Michael Dean");
        dean.setAge(12);
        dean.setPhoneNumber("0809579090");

        //create a JAXBContext object with the JAXBContext factory method
        JAXBContext context = JAXBContext.newInstance(dean.getClass());
        // use the JAXBContext object to create a Marshaller object
        Marshaller marshaller = context.createMarshaller();
        //The marshaller object is used to call the marshal method to perform the marshal

       //the generated xml could be printed on the console (System.out)
        //  marshaller.marshal(dean, System.out);

        //the generated xml could be stored in a file
        //File file = new File("dean.xml");
        //marshaller.marshal(dean, file);

        //to store the generated xml in a toString
        StringWriter write = new StringWriter();
        marshaller.marshal(dean, write);
        String xml = write.toString();
        System.out.println(xml);







    }
}
