package abogadocs.backend.services

import abogadocs.backend.domain.Category
import grails.transaction.Transactional

@Transactional
class CategoryService {

    static def createCategory(File file) {
        new Category(name: file.getName())
                .save(failsOnError: true, flush: true)
    }
}
