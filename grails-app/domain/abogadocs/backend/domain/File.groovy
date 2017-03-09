package abogadocs.backend.domain

class File {

    String name
    String path

    static belongsTo = [category: Category]

    static constraints = {
        name blank: false
        path blank: false
    }
}
