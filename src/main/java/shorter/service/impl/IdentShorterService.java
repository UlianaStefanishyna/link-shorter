package shorter.service.impl;

import shorter.service.ShorterService;

public class IdentShorterService implements ShorterService {


    public void init(){
        System.out.println("init() : " + this.getClass().getName());
    }

    @Override
    public String shorten(String path) {
        return path;
    }
}