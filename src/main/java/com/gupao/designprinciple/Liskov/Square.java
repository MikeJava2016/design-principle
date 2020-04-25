package com.gupao.designprinciple.Liskov;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Rectangle{
    private long length;

    @Override
    public void setHeight(long height) {
        setLength(length);
    }

    @Override
    public void setWidth(long width) {
        setLength(width);
    }

    @Override
    public long getHeight() {
        return getLength();
    }

    @Override
    public long getWidth() {
        return getLength();
    }
}
