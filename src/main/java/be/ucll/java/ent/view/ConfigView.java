package be.ucll.java.ent.view;

import be.ucll.java.ent.controller.UserController;
import be.ucll.java.ent.utils.BeanUtil;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.PostConstruct;

@Route("config")
public class ConfigView extends VerticalLayout {
    private UserController userController;

    @PostConstruct
    public void buildUI(){
        userController = BeanUtil.getBean(UserController.class);
        Label lblFirstName = new Label();
        lblFirstName.setText(userController.getFirstName());
        add(lblFirstName);
    }
}
