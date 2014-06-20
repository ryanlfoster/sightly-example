package com.adobe.aem.docs;

import com.adobe.cq.sightly.WCMUse;

// Info class
public class Info extends WCMUse {
    private String title;
    private String description;

    @Override
    public void activate() throws Exception {
        title = getProperties().get("title", "");
        description = getProperties().get("description", "");
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}