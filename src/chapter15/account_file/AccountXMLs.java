package chapter15.account_file;


import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class AccountXMLs {
    @XmlElement(name = "account")
    private List<AccountXML> accounts = new ArrayList<>(); // stores Accounts

    // returns the List<Accounts>
    public List<AccountXML> getAccounts() {
        return accounts;
    }
}
