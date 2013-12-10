package com.mfin.rest.controller.fixture;

import com.mfin.domain.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gorbunkov
 * @version $Id$
 */
public class RestDataFixture {
    public static List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("House"));
        categories.add(new Category("Car"));
        categories.add(new Category("Salary"));
        return categories;
    }
}
