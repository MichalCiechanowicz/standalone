package com.example.standalone;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@Route("ignition")
public class IgnitionView extends HorizontalLayout {

    private File file;
    private RegistryService registryService;
    private Testy testy;

    @Autowired
    public IgnitionView(File file, RegistryService registryService, Testy testy) throws IOException {
        this.file = file;
        this.registryService = registryService;
        this.testy = testy;

        int[][] ignitionMap1 = testy.getIgnitionMap();

//        registryService.getRegistryList().forEach(System.out::println);

        Grid<Registry> ignitionMap = new Grid<>(Registry.class);
        ignitionMap.setHeightByRows(true);
        ignitionMap.setItems(registryService.getRegistryList());
        ignitionMap.getColumnByKey("one").setHeader("100");
        ignitionMap.setColumns("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve");
        add(ignitionMap);

    }

}
