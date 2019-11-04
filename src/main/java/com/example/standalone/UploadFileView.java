package com.example.standalone;

import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("upload")
public class UploadFileView extends Upload {

    private File file;

    @Autowired
    public UploadFileView(File file) {
        this.file = file;

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);



    }

    //todo ogarnac uplad pliku tak zeby byl uzywany przez fileservice

}
