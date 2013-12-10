package com.mfin.rest.controller;

import com.mfin.domain.Category;
import com.mfin.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gorbunkov
 * @version $Id$
 */
@Controller
public class CategoryController {

    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
