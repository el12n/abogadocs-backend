package abogadocs.backend.controller

import abogadocs.backend.domain.Category
import grails.rest.RestfulController

class CategoryController extends RestfulController {
    static responseFormats = ['json', 'xml']

    CategoryController() {
        super(Category)
    }
}
