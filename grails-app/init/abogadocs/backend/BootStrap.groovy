package abogadocs.backend

import abogadocs.backend.services.CategoryService
import abogadocs.backend.services.FileService

class BootStrap {

    def init = { servletContext ->
        scanForMissingFiles()
    }
    def destroy = {
    }

    def scanForMissingFiles() {
        try {
            addFilesAndCategories(new File("./docs"))
        } catch (FileNotFoundException fe) {
            fe.printStackTrace()
        } catch (IOException ie) {
            ie.printStackTrace()
        } catch (Exception e) {
            e.printStackTrace()
        }
    }

    def addFilesAndCategories(File file) {
        if (file.isDirectory()) {
            if (file.getName() != "docs")
                CategoryService.createCategory(file)
            file.eachFile { File subFile ->
                addFilesAndCategories(subFile)
            }
        } else {
            FileService.createFile(file)
        }
    }
}
