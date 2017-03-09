package abogadocs.backend.controller

import abogadocs.backend.domain.File
import grails.rest.RestfulController

class FileController extends RestfulController {
    static responseFormats = ['json', 'xml']

    FileController() {
        super(File)
    }
}
