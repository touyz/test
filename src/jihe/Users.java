package jihe;
// 封装实体类
public class Users {
    private String name;
    private Double height;
    private Double salary;

    public Users() {
    }

    public Users(String name, Double height, Double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                '}';
    }
}
