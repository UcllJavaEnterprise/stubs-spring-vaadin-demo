package be.ucll.java.ent.view;

import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import javax.annotation.PostConstruct;

@Route("")
@PageTitle("StuBS")
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
class HomeView extends VerticalLayout {

    public HomeView() {
    }

    @PostConstruct
    private void setMainViewContent() {
        H3 header = new H3("Stubs - Het STUdenten Beheer Systeem");
        add(header);
    }
}
