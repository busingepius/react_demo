/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/03/2024
 * Time : 08:43
 * Project Name : answer2.prob2A
 */
package answer2.prob2A;

public class GradleReport {
    public Student getOwner() {
        return owner;
    }

    private Student owner;
    GradleReport(Student owner){
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "GradleReport{" +

                '}';
    }
}
