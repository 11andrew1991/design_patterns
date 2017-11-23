package virtualapp;

import java.util.List;

/**
 * Proxy - Provides an interface identical to Subject’s so that a proxy can be substituted for the real subject.
 */
public class ContactListProxyImpl implements ContactList {

    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListImpl();
        }

        return contactList.getEmployeeList();
    }
}
