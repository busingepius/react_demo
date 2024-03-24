/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/03/2024
 * Time : 08:42
 * Project Name : answer2.prob2A
 */
package answer2.prob2A;

public class Student {
    private String name;
    private GradleReport gradleReport;

    public Student(String name){
        this.name = name;
        this.gradleReport = new GradleReport(this);
    }

    public String getName() {
        return name;
    }

    public GradleReport getGradleReport() {
        return gradleReport;
    }
}
