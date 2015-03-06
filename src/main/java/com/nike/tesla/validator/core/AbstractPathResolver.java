package com.nike.tesla.validator.core;

import com.nike.tesla.validator.path.PathResolverMap;
import com.nike.tesla.validator.path.destinations.IPathDestination;
import com.nike.tesla.validator.exceptions.PathResolverException;
import com.nike.tesla.validator.path.nodes.RootNode;
import com.nike.tesla.validator.plugins.IPathResolverPlugin;
import com.nike.tesla.validator.postprocess.IPostProcessManager;
import com.nike.tesla.validator.postprocess.IRequestPostProcessor;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * Created by wandyrer on 12/28/2014.
 */
public class AbstractPathResolver<F extends AbstractPathResolverFactory> {

    protected PathResolverMap nodeMap;

    protected Map<PathPrefix, RootNode> root;

    protected IPostProcessManager postProcessManager;

    protected List<IPathResolverPlugin> plugins;

    protected Executor requestProcessor;

    public IPathDestination getDestination(ServletRequest request)
            throws PathResolverException {

    }

    public IPathDestination getDestination(HttpServletRequest request)
    {

    }

    public IPathDestination getDestination(ServletRequest request,
                                           boolean validate,
                                           boolean allowMapUpdates,
                                           boolean postProcess)
            throws PathResolverException {

    }

    public IPathDestination getDestination(HttpServletRequest request,
                                           boolean validate,
                                           boolean allowMapUpdates,
                                           boolean postProcess)
        throws PathResolverException {

    }

    public HttpResponse getResponse(HttpServletRequest request)
            throws PathResolverException {

    }

    public void registerPostProcessor(IRequestPostProcessor postProcessor) {

    }

    public void registerPlugin(IPathResolverPlugin plugin) {

    }

    public Executor getExecutor() {
        return processor;
    }


}
