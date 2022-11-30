package be.ucll.java.ent.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class InformationDialog extends Dialog {

    public InformationDialog() {
        VerticalLayout v1 = new VerticalLayout();
        v1.add(new Label("Welkom op onze website!"));
        Button btnOk = new Button("Ok");
        btnOk.addClickListener(event -> {
           this.close();
        });
        v1.add(btnOk);
        add(v1);
    }
}
