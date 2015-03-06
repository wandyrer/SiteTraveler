package com.nike.tesla.validator.utils;

import com.nike.tesla.validator.path.destinations.IPathDestination;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wandyrer on 12/27/2014.
 */
public class RequestWindowCounter {


    private AtomicInteger currentCount;
    private List<AtomicInteger> previousValues;

    public RequestWindowCounter(IPathDestination destination, RequestWindow window)
    {

    }
}
