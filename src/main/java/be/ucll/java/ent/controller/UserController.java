package be.ucll.java.ent.controller;

import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.spring.annotation.VaadinSessionScope;
import org.springframework.stereotype.Component;

// Opening a new tab wil again show the login screen
//@UIScope

// Uncomment to continue working in a new tab. No login screen appears
@VaadinSessionScope
@Component
public class UserController {

    private String firstName;

    public void saveFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}