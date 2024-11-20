package service.serviceImpl;

import dataBase.DataBase;
import models.Library;
import service.LibraryService;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public void saveLibrary(Library library) {
        DataBase.libraries.add(library);
    }

    @Override
    public ArrayList<Library> getAllLibraries() {
        return DataBase.libraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        for(Library library:DataBase.libraries){
            if(library.getId()==id){
                return library;
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        Scanner scanner = new Scanner(System.in);
        for(Library librarys:DataBase.libraries){
            if(library.getId()==id){
                library.setName(scanner.nextLine());
            }
        }
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for(Library library:DataBase.libraries){
            if(library.getId()==id){
                DataBase.libraries.remove(library);
            }
        }
        return "";
    }
}
