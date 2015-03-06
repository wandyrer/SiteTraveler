package com.nike.tesla.validator.path.resources;

/**
 * Created by wandyrer on 12/27/2014.
 */
public interface IPathResourceKey<E extends IPathResource> {

    public boolean isCacheable();

    public int getCacheTimeToLive();

    public String toString();

    public int hashcode();

    public boolean addToDictionary();




}
