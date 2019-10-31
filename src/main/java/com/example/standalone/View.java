package com.example.standalone;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;


@Route("tata")
public class View extends VerticalLayout {

    private File file;

    @Autowired
    public View(File file) throws IOException {
        this.file = file;

        ArrayList ignition = file.getIgnitionMap();


    }

}

