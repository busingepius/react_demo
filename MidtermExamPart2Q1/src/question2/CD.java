/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 10:48
 * Project Name : question2
 */
package question2;

public class CD extends LendingItem{
    private String productId;
    private String title;
    private String company;

    public CD(String productId, String title, String company) {
        this.productId = productId;
        this.title = title;
        this.company = company;
    }
}
