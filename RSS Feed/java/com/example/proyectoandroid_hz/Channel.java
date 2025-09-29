package com.example.proyectoandroid_hz;

import android.content.ClipData;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


@Root(name = "channel", strict = false)
public class Channel {


    @ElementList(inline = true)
    private List<Item> items;

    public Channel() {
    }

    public Channel(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
