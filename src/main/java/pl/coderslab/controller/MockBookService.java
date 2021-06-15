package pl.coderslab.controller;
import pl.coderslab.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class MockBookService {
   private List<Book> list;

   private static Long nextId = 4L;
   public MockBookService() {
      list = new ArrayList<>();
      list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
      list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion", "programming"));
      list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion", "programming"));
   }

   public List<Book> getList() {
      return list;
   }
}
