package com.nf147.ssm_superman.BuilderPattern.builder;

public interface IBuildHuman {

    public void buildHead();

    public void buildBody();

    public void buildHand();

    public void buildFoot();

    public Human createHuman();

}
