environments {
    production {
        dataSource {
            dbCreate = "update"
            driverClassName = "org.h2.Driver"
            dialect = org.hibernate.dialect.H2Dialect
            url = "jdbc:h2:./DB/prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            username = "sa"
            password = ""
        }
    }
}