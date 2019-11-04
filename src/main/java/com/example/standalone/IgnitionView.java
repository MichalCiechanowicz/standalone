package com.example.standalone;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

@Route("ignition")
public class IgnitionView extends HorizontalLayout {

    private File file;

    @Autowired
    public IgnitionView(File file) throws IOException {
        this.file = file;

        List<File> ignition = file.getIgnitionMap();

        TextField textField = new TextField();
        textField.setValue(String.valueOf(ignition));

        Grid<File> ignitionMap = new Grid<>(File.class);
        ignitionMap.setItems(ignition);

        add(textField);

    }
}
