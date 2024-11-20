package service.serviceImpl;

import dataBase.DataBase;
import models.Library;
import models.Reader;
import service.ReaderService;

import java.util.ArrayList;

public class ReaderServiceImpl implements ReaderService {
    @Override
    public void saveReader(Reader reader) {
        DataBase.readers.add(reader);
    }

    @Override
    public ArrayList<Reader> getAllReaders() {
        return DataBase.readers;
    }


    @Override
    public Reader getReaderById(Long id) {
        for(Reader reader:DataBase.readers){
            if(reader.getId()==id){
                return reader;
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for(Reader reader1:DataBase.readers){
            if(reader1.getId()==id){
                reader1.setFullName(reader.getFullName());
            }

        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (Library library: DataBase.libraries ) {
            if (library.getId() == libraryId){
                for (Reader reader: DataBase.readers) {
                    if (reader.getId() == readerId){
                        library.getReaders().add(reader);
                    }
                }
            }
        }
    }
}
