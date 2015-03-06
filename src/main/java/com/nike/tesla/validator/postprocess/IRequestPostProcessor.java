package com.nike.tesla.validator.postprocess;

import javax.servlet.ServletRequest;

/**
 * Created by wandyrer on 12/29/2014.
 */
public interface IRequestPostProcessor {

    public IPostProcessManager getRequestPostProcessManager();

    public void processRequest(ServletRequest request);


}
