package service;

import dao.BookDaoImpl;
import model.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.enterprise.inject.Produces;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDaoImpl bookDao = new BookDaoImpl();

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }

    /**
     * Sets bookDao.
     *
     * @param bookDao the new value.
     */
    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}