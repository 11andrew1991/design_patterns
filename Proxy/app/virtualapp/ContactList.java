package virtualapp;

import java.util.List;

/**
 * Subject - Defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected.
 */
public interface ContactList {

    List<Employee> getEmployeeList();

}
