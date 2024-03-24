/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 10:46
 * Project Name : question2
 */
package question2;

public class Book extends LendingItem{
    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String isbn, String title, String fname, String lname) {
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = fname;
        this.authorLastName = lname;
    }
}
