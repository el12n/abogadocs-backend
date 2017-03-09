package abogadocs.backend.domain

class Category {

    String name

    static hasMany = [files: File]

    static constraints = {
        name blank: false
    }
}
