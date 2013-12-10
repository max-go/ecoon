package com.mfin.rest.controller;

import com.mfin.rest.controller.fixture.RestDataFixture;
import com.mfin.service.CategoryService;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * @author gorbunkov
 * @version $Id$
 */
public class ViewCategoryIntegrationTest {

    MockMvc mockMvc;

    @InjectMocks
    CategoryController controller;

    @Mock
    CategoryService categoryService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        this.mockMvc = standaloneSetup(controller).setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
    }

    public void testGetAllCategories() {
        when(categoryService.getAllCategories()).thenReturn(RestDataFixture.getAllCategories());

    }
}
