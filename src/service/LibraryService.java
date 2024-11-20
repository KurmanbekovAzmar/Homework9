package service;

import models.Library;

import java.util.ArrayList;

public interface LibraryService {
    void saveLibrary(Library library);

    ArrayList<Library>getAllLibraries();

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library library);

    String deleteLibrary(Long id);


}
