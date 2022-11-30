package be.ucll.java.ent.view;

import be.ucll.java.ent.controller.UserController;
import be.ucll.java.ent.utils.BeanUtil;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.context.MessageSource;

import javax.annotation.PostConstruct;
import java.util.Locale;

@Route("")
@PageTitle("StuBS")
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
@CssImport("./styles/myStyles.css")
class HomeView extends VerticalLayout {

    private UserController userController;
    private MessageSource msg;

    public HomeView() {
    }

    @PostConstruct
    private void setMainViewContent() {
        userController = BeanUtil.getBean(UserController.class);
        msg = BeanUtil.getBean(MessageSource.class);

        InformationDialog infoDialog = new InformationDialog();
        infoDialog.open();

        H3 header = new H3(msg.getMessage("title", null, Locale.US));
        header.setId("title");

        TextField txtFirstName = new TextField();

        Button btnAddFirstName = new Button("Add");
        btnAddFirstName.addClickListener(event -> {
            userController.saveFirstName(txtFirstName.getValue());
            getUI().ifPresent(x -> x.navigate("config"));
        });

        add(header, txtFirstName, btnAddFirstName);


/*        Image ucllImage = new Image("images/ucll.jpg","UCLL logo");
        add(ucllImage);

        Icon myIcon = new Icon(VaadinIcon.ACADEMY_CAP);
        add(myIcon);
*/
    }
}
