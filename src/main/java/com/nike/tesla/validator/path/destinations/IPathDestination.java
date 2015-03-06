package com.nike.tesla.validator.path.destinations;

import com.nike.tesla.validator.path.segments.IPathSegment;
import com.nike.tesla.validator.core.HttpMethod;
import com.nike.tesla.validator.core.HttpStatusResponse;
import com.nike.tesla.validator.utils.RequestWindow;
import com.nike.tesla.validator.validators.IPathDestinationValidation;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.List;

/**
 * Created by wandyrer on 12/27/2014.
 */
public interface IPathDestination<E extends ServletResponse> extends Serializable, IPathSegment {

    public HttpMethod getMethod();

    public HttpStatusResponse validate();

    public E getResponse();

    public List<IPathDestinationValidation<? extends IPathDestination>> getValidationChain();

    public long getTimeToLive();

    public boolean isError();

    public boolean isExpired();

    public boolean isCached();

    public int getCurrentRequestCount(RequestWindow window);

    public int getLastRequestCount(RequestWindow window);

    public ServletResponse buildResponse(ServletRequest request);

    public HttpServletResponse buildHttpResponse(HttpServletRequest request);






}
