package com.productcrowler.service;

import org.springframework.messaging.handler.annotation.SendTo;

public class LinkFinderServiceImpl implements LinkFinderService {

    @SendTo("rooturl.queue")
    @Override
    public String addRootUrl(final String rootUrl) {
        return rootUrl;
    }
}
