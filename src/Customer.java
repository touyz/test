public class Customer
{
    public static void main(String[] args)
    {
    }
}
class shenFen{
    private int idCard;
    private String name;
    private double yuEr;

    public shenFen(int idCard, String name, double yuEr) {
        this.idCard = idCard;
        this.name = name;
        this.yuEr = yuEr;
    }

    public shenFen() {
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYuEr() {
        return yuEr;
    }

    public void setYuEr(double yuEr) {
        this.yuEr = yuEr;
    }
}
