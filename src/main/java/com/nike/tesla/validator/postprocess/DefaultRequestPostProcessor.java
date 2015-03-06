package com.nike.tesla.validator.postprocess;

import javax.servlet.ServletRequest;

/**
 * Created by wandyrer on 12/29/2014.
 */
public class DefaultRequestPostProcessor implements IRequestPostProcessor {


    @Override
    public IPostProcessManager getRequestPostProcessManager() {
        return null;
    }

    @Override
    public void processRequest(ServletRequest request) {

    }

}
