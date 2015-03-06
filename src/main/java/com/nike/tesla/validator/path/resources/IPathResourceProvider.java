package com.nike.tesla.validator.path.resources;

/**
 * Created by wandyrer on 12/27/2014.
 */
public interface IPathResourceProvider<E extends IPathResource> {

    public E getResource(IPathResourceKey<E> keyParam);


}
