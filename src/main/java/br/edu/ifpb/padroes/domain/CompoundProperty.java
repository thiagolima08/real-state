package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundProperty implements Property {
    protected List<Property> propertyList = new ArrayList<>();

    public CompoundProperty(Property... properties) {
        add(properties);
    }

    private void add(Property... properties) {
        propertyList.addAll(Arrays.asList(properties));
    }

    @Override
    public float getPrice() {
        float price = 0f;
        for (Property property: propertyList) {
            price += property.getPrice();
        }

        return price;
    }
}
