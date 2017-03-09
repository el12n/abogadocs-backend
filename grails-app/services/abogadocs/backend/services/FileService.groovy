package abogadocs.backend.services

import abogadocs.backend.domain.Category
import abogadocs.backend.domain.File
import grails.transaction.Transactional

@Transactional
class FileService {

    static def createFile(java.io.File file) {
        new File(
                name: file.getName(),
                path: file.getPath(),
                category: Category.findByName(file.getParentFile().getName())
        ).save(failsOnError: true, flush: true)
    }
}
